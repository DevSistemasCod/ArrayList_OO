package org.example;

import entidades.ListaTarefas;
import entidades.Tarefa;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        Tarefa tarefa1 = new Tarefa("Estudar Java", "Rever conceitos de POO");
        Tarefa tarefa2 = new Tarefa("Estudar Banco", "Rever conceitos de Normalização");
        Tarefa tarefa3 = new Tarefa("Projeto", "Efetuar integração");
        listaTarefas.adicionarTarefa(tarefa1);
        listaTarefas.adicionarTarefa(tarefa2);
        listaTarefas.adicionarTarefa(tarefa3);

        System.out.println("=== Lista inicial de tarefas ===");
        listaTarefas.listarTarefas();

        System.out.println("Marcar tarefa como concluída");
        listaTarefas.marcarTarefaConcluida(2);
        listaTarefas.listarTarefas();

        System.out.println("--- REMOVER TAREFA ---");
        listaTarefas.removerTarefa(0);
        listaTarefas.listarTarefas();
    }
}