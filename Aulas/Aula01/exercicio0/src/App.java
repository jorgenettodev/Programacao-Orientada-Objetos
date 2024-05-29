import java.util.Scanner;

public class App {

    private static final Scanner SCAN = new Scanner(System.in);
    private static final int DISCIPLINAS = 3;

    public static void main(String[] args) {
        int quantidadeAlunos = receberQuantidadeAlunos();
        int[][] alunos = new int[quantidadeAlunos][DISCIPLINAS];
        solicitarNotaDosAlunos(alunos, quantidadeAlunos);
        apresentarNotaDosAlunosComStatus(alunos, quantidadeAlunos);
        
    }

    // declara uma função que pede a quantidade de alunos e retorna este valor. 
    // (eh util para ser armazenada numa variável)
    public static int receberQuantidadeAlunos() {
        System.out.println("Digite a quantidade de alunos: ");
        return Integer.parseInt(SCAN.nextLine());
        
    }

    // para cada aluno, o programa deve solicitar a nota das 3 disciplinas.
    public static void solicitarNotaDosAlunos(int[][] alunos, int quantidadeAlunos) {
        for(int i =0; i < quantidadeAlunos; i++) {
            System.out.println("Aluno: " + (i + 1));
            for (int j = 0; j < DISCIPLINAS; j++) {
                System.out.println("Digite a nota da " + (j + 1) + "a disciplina: ");
                alunos[i][j] = Integer.parseInt(SCAN.nextLine());
            }
            System.out.println("\n");
        }
    }

    public static void apresentarNotaDosAlunosComStatus(int[][] alunos, int quantidadeAlunos) {
        for (int i = 0 ; i < quantidadeAlunos; i++) {
            System.out.println("Aluno: " + (i+1));
            double somaDasNotas = 0.0;
            for (int j = 0; j < DISCIPLINAS; j++) {
                somaDasNotas = somaDasNotas + alunos[i][j];
            }
            double media = somaDasNotas / DISCIPLINAS;
            boolean foiAprovado = media >= 5 ? true : false;

            System.out.println("Média: " + media);
            if (foiAprovado) {
                System.out.print(" Status: Aprovado");
            } else {
                System.out.print(" Status: Reprovado");
            }
            System.out.println("\n");
        }
    }

}
