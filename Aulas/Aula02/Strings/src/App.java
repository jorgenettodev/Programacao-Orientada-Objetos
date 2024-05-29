import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String nomes = SCAN.nextLine();
        String[] nomesSeparados = nomes.split(" ");

        int tamanhoArray = nomesSeparados.length;
        String ultimoNome = nomesSeparados[nomesSeparados.length - 1];

        for (int i = 0; i < tamanhoArray - 1; i++) {
            System.out.println(nomesSeparados[i]);
        }

        escrevePalavraEmLinhasSeparadas(ultimoNome);


        
    }

    public static void escrevePalavraEmLinhasSeparadas(String palavra) {
        char[] palavraSeparada = palavra.toCharArray();

        for (int i = 0; i < palavraSeparada.length; i++) {
            System.out.println(palavraSeparada[i]);
        }
    }
}
