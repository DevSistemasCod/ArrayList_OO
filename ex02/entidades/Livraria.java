package entidades;

import java.util.ArrayList;

public class Livraria {
	 private ArrayList<Livro> livros;

	    public Livraria() {
	        livros = new ArrayList<>();
	    }

	    public void adicionarLivro(Livro livro) {
	        livros.add(livro);
	    }

	    public void removerLivro(Livro livro) {
	        livros.remove(livro);
	    }

	    public void renomearLivro(Livro livro, String novoNome) {
	        livro.setNome(novoNome);
	    }

	    public void exibirLivros() {
	        for (Livro livro : livros) {
	            livro.exibirLivro();
	            System.out.println("\n--------------------");
	        }
	    }
}
