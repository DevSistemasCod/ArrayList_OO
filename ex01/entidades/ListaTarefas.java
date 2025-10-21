package entidades;

import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.listaTarefas.add(tarefa);
    }

    public void marcarTarefaConcluida(int indice) {
        if ((indice >= 0) && (indice < this.listaTarefas.size())) {
            Tarefa tarefa = this.listaTarefas.get(indice);
            tarefa.setStatusDeConclusao(true);
            System.out.println("Tarefa " + tarefa.getNome() + "Concluída!");
        } else {
            System.out.println("Índice inválido!!!");
        }
    }

    public void removerTarefa(int indice) {
        if ((indice >= 0) && (indice < this.listaTarefas.size())) {
            Tarefa tarefa = this.listaTarefas.remove(indice);
            System.out.println("Tarefa " + tarefa.getNome() + " Removida!");
        } else {
            System.out.println("Índice inválido!!!");
        }
    }

    public void listarTarefas() {
        if (!this.listaTarefas.isEmpty()) {
            for (int i = 0; i < this.listaTarefas.size(); i++) {
                Tarefa tarefa = listaTarefas.get(i);
                System.out.println("Tarefa: " + tarefa.getNome() + " " + tarefa.getDescricao() + " " + tarefa.isStatusDeConclusao());
            }
        } else {
            System.out.println("Não existem tarefas na Lista!!!");
        }
    }
}