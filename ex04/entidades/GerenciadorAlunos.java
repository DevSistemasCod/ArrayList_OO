package entidades;
import java.util.ArrayList;
import java.util.Iterator;

class GerenciadorAlunos {
    private ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(String nome, ArrayList<Float> notas) {
        Aluno aluno = new Aluno(nome);
		
        for (float nota : notas) {
            aluno.adicionarNota(nota);
        }
        listaAlunos.add(aluno);
    }

    public Float calcularMediaPorNome(String nome) {
        Iterator<Aluno> iterador = listaAlunos.iterator();
        while (iterador.hasNext()) {
            Aluno aluno = iterador.next();
            //ignora o caso -se maiusculas e minusculas
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno.calcularMedia();
            }
        }
        return null; // se não encontrar
    }
}
