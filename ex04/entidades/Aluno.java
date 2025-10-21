package entidades;

import java.util.ArrayList;

class Aluno {
    private String nome;
    private ArrayList<Float> notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarNota(float nota) {
        notas.add(nota);
    }

    public float calcularMedia() {
        if (notas.isEmpty()) {
            return 0;
        }
        float acumuladorDeNotas = 0;
        for (float nota : notas) {
            acumuladorDeNotas = acumuladorDeNotas + nota;
        }
        return acumuladorDeNotas / notas.size();
    }
}
