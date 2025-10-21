package principal;

import entidades.LivroV1;
import entidades.LivrariaV1;

public class PrincipalLivrariaV1 {
	public static void main(String[] args) {
        LivrariaV1 livraria = new LivrariaV1();

        LivroV1 livro1 = new LivroV1("Dom Casmurro", 1, "Machado de Assis", 10);
        LivroV1 livro2 = new LivroV1("Memórias Póstumas de Brás Cubas", 2, "Machado de Assis", 7);

        livraria.adicionarLivro(livro1);
        livraria.adicionarLivro(livro2);

        livraria.exibirLivros();

        livraria.removerLivro(livro2);

        livraria.exibirLivros();

        livraria.renomearLivro(livro1, "Dom Casmurro - Edição Especial");

        livraria.exibirLivros();
    }
}
