package entidades;

import java.util.ArrayList;

public class LivrariaV1 {
	 private ArrayList<LivroV1> livros;

	    public LivrariaV1() {
	        livros = new ArrayList<>();
	    }

	    public void adicionarLivro(LivroV1 livro) {
	        livros.add(livro);
	    }

	    public void removerLivro(LivroV1 livro) {
	        livros.remove(livro);
	    }

	    public void renomearLivro(LivroV1 livro, String novoNome) {
	        livro.setNome(novoNome);
	    }

	    public void exibirLivros() {
	        for (LivroV1 livro : livros) {
	            livro.exibirLivro();
	            System.out.println("\n--------------------");
	        }
	    }
}
