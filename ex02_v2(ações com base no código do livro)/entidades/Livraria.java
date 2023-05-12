package entidades;

import java.util.ArrayList;

public class Livraria {
	private ArrayList<Livro> livros;

	public Livraria() {
		this.livros = new ArrayList<>();
	}

	public void adicionar(Livro livro) {
		if (verificarSeNaLista(livro.getCodigo())) {
			System.out.println("Já existe um livro com o código informado. Por favor, insira um código diferente.");
		}
		else {
			this.livros.add(livro);
			System.out.println("Livro adicionado com sucesso!");
		}
		
	}

	public void remover(int codigo) {
		boolean removido = false;
		
		if(!livros.isEmpty()) {
			for (Livro livro : this.livros) {
				if (livro.getCodigo() == codigo) {
					this.livros.remove(livro);
					System.out.println("Livro removido com sucesso!");
					removido = true;
					break;
				}
			}
			if (removido == false) {
			System.out.println("Não foi possível remover o livro. "
						+ "\nLivro não encontrado na lista.");
			}
		}
	}

	public void renomear(int codigo, String novoNome) {
		if (!verificarSeNaLista(codigo)) {
			System.out.println("\nNão foi possível renomear o livro. "
					+ "\nLivro não encontrado na lista.");
		} else {
			for (Livro livro : this.livros) {
				if (livro.getCodigo() == codigo) {
					livro.setNome(novoNome);
					System.out.println("\nLivro renomeado com sucesso!");
				}
			}
		}
	}

	public void visualizarLivros() {
		if(this.livros.isEmpty()) {
			System.out.println("\nLista Vazia!!!");
		}else {
			for (Livro livro : this.livros) {
				livro.exibirLivro();
			}
		}
	}

	public boolean verificarSeNaLista(int codigo) {
		for (Livro livro : this.livros) {
			if (livro.getCodigo() == codigo) {
				return true;
			}
		}
		return false;
	}
}