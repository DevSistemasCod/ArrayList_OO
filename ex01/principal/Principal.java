package principal;

import java.util.Scanner;
import entidades.Tarefas;
import entidades.Tarefa;

public class Principal {
	
	public static void menu(Scanner lerDados, int opcao, Tarefas tarefas) {
		switch (opcao) {
		case 1:
			System.out.print("Nome da tarefa: ");
			String nome = lerDados.nextLine();
			System.out.print("Descricao da tarefa: ");
			String descricao = lerDados.nextLine();
			Tarefa tarefa = new Tarefa(nome, descricao);
			tarefas.adicionarTarefa(tarefa);
			System.out.println("Tarefa adicionada com sucesso!\n");
			break;
		case 2:
			System.out.println("----- TAREFAS -----");
			tarefas.listarTarefas();
			System.out.println();
			break;
		case 3:
			System.out.print("Digite o indice da tarefa a ser concluida: ");
			int indiceConcluida = lerDados.nextInt();
			lerDados.nextLine();
			tarefas.marcarTarefaConcluida(indiceConcluida-1);
			break;
		case 4:
			System.out.print("Digite o índice da tarefa a ser removida: ");
			int indiceRemover = lerDados.nextInt();
			lerDados.nextLine();
			tarefas.removerTarefa(indiceRemover-1);
			break;
		case 0:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Opção invalida!\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);
		Tarefas tarefas = new Tarefas();
		int opcao;

		do {
			System.out.println("----- MENU -----");
			System.out.println("1 - Adicionar tarefa");
			System.out.println("2 - Listar tarefas");
			System.out.println("3 - Marcar tarefa como concluida");
			System.out.println("4 - Remover tarefa");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opcao: ");
			
			opcao = lerDados.nextInt();
			lerDados.nextLine(); //(essa linha deve ser adicionada pois consome o caractere \n)
			//outra opção é fazer um cast do tipo opcao = Integer.parseInt(lerDados.nextLine());
			menu(lerDados, opcao, tarefas);

		} while (opcao != 0);
          
       		lerDados.close();
      }
}
