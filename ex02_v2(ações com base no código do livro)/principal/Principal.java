package principal;

import entidades.Livro;

import java.util.Scanner;
import entidades.Livraria;

public class Principal {

	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);
		Livraria livraria = new Livraria();

		int opcao = 0;

		do {
			System.out.println("\n=== LIVRARIA ===");
			System.out.println("1 - Adicionar livro");
			System.out.println("2 - Remover livro");
			System.out.println("3 - Renomear livro");
			System.out.println("4 - Visualizar livros cadastrados");
			System.out.println("5 - Sair");
			System.out.print("\nDigite a opção desejada: ");

			opcao = lerDados.nextInt();

			switch (opcao) {
			case 1:
				lerDados.nextLine();
				System.out.print("Nome do livro: ");
				String nome = lerDados.nextLine();

				System.out.print("Código do livro: ");
				int codigo = lerDados.nextInt();

				lerDados.nextLine(); // consumir a quebra de linha
				System.out.print("Autor do livro: ");
				String autor = lerDados.nextLine();

				System.out.print("Quantidade em estoque: ");
				int quantidade = lerDados.nextInt();

				Livro livro = new Livro(nome, codigo, autor, quantidade);
				livraria.adicionar(livro);
				break;

			case 2:
				System.out.print("Código do livro a ser removido: ");
				codigo = lerDados.nextInt();
				livraria.remover(codigo);
				break;

			case 3:
				System.out.print("Código do livro a ser renomeado: ");
				codigo = lerDados.nextInt();
				lerDados.nextLine();
				System.out.print("Novo nome do livro: ");
				nome = lerDados.nextLine();
				livraria.renomear(codigo, nome);
				break;

			case 4:
				livraria.visualizarLivros();
				break;

			case 5:
				System.out.println("Encerrando o programa...");
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (opcao != 5);

		lerDados.close();
	}
}