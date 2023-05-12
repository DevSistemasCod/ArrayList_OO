package entidades;

public class Livro {
    private String nome;
    private int codigo;
    private String autor;
    private int quantidade;

    public Livro(String nome, int codigo, String autor, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.autor = autor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirLivro() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade: " + quantidade);
    }
}