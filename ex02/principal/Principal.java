package principal;

import entidades.Livro;
import entidades.Livraria;

public class Principal {
	public static void main(String[] args) {
        Livraria livraria = new Livraria();

        Livro livro1 = new Livro("Dom Casmurro", 1, "Machado de Assis", 10);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", 2, "Machado de Assis", 7);

        livraria.adicionarLivro(livro1);
        livraria.adicionarLivro(livro2);

        livraria.exibirLivros();

        livraria.removerLivro(livro2);

        livraria.exibirLivros();

        livraria.renomearLivro(livro1, "Dom Casmurro - Edição Especial");

        livraria.exibirLivros();
    }
}
