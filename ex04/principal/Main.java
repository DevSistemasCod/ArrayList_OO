package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        Scanner lerTeclado = new Scanner(System.in);

        while (true) {
            int opcao = exibirMenu(lerTeclado);
            switch (opcao) {
                case 1:
                    adicionarAluno(gerenciador, lerTeclado);
                    break;
                case 2:
                    calcularMediaAluno(gerenciador, lerTeclado);
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    lerTeclado.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    /** Exibe o menu e retorna a opção escolhida */
    private static int exibirMenu(Scanner scanner) {
        System.out.println("\n=== MENU ===");
        System.out.println("1 - Adicionar Aluno");
        System.out.println("2 - Calcular Média de um Aluno");
        System.out.println("3 - Sair");
        System.out.print("Escolha: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // limpar buffer
        return opcao;
    }

    /** Lógica para adicionar um aluno */
    private static void adicionarAluno(GerenciadorAlunos gerenciador, Scanner sc) {
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        ArrayList<Float> notas = coletarNotas(sc);

        gerenciador.adicionarAluno(nome, notas);
        System.out.println("Aluno adicionado com sucesso!");
    }

    /** Lógica para calcular a média de um aluno */
    private static void calcularMediaAluno(GerenciadorAlunos gerenciador, Scanner sc) {
        System.out.print("Digite o nome do aluno: ");
        String nomeBusca = sc.nextLine();
        Float media = gerenciador.calcularMediaPorNome(nomeBusca);

        if (media != null) {
            System.out.printf("Média de %s: %.2f\n", nomeBusca, media);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    /** Coleta notas do usuário até que ele digite -1 */
    private static ArrayList<Float> coletarNotas(Scanner sc) {
        ArrayList<Float> notas = new ArrayList<>();
        while (true) {
            System.out.print("Digite uma nota (ou -1 para terminar): ");
            float nota = sc.nextFloat();
            if (nota == -1) break;

            if (validarNota(nota)) {
                notas.add(nota);
            } else {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        }
        return notas;
    }

    /** Valida se a nota está no intervalo permitido (0 a 10). */
    private static boolean validarNota(float nota) {
        // Uma nota é válida se estiver entre 0 e 10 (inclusive)
        if ((nota >= 0 ) && (nota <= 10)) {
            return true;  // Retorna verdadeiro se a nota for válida
        } else {
            return false; // Retorna falso se estiver fora do intervalo permitido
        }
    }
}