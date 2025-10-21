package entidades;

public class Tarefa {
    private String nome;
    private String descricao;
    private boolean statusDeConclusao;

    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.statusDeConclusao = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatusDeConclusao() {
        return statusDeConclusao;
    }

    public void setStatusDeConclusao(boolean statusDeConclusao) {
        this.statusDeConclusao = statusDeConclusao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", statusDeConclusao=" + statusDeConclusao +
                '}';
    }
}