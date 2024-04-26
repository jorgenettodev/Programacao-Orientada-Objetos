import java.util.*;

public class App {
    private static final int TAMANHO_VETOR = 10;
    public static int[] vetorNumeros = new int[TAMANHO_VETOR];
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
      preencheVetor(vetorNumeros);
      int numeroProcurado = scan.nextInt();
      
      boolean achouNumero = encontraNumeroNoVetor(vetorNumeros, numeroProcurado);
      
      if(achouNumero) {
        System.out.println("ACHEI");
      } else {
        System.out.println("NAO ACHEI");
      }
  }
    private static void preencheVetor(int[] vetor) {
      for (int i = 0; i < TAMANHO_VETOR; i++) {
        vetor[i] = scan.nextInt();
      }
    }
    
    private static boolean encontraNumeroNoVetor(int[] vetor, int numeroProcurado) {
      boolean achouNumero = false;
      
      for (int i = 0; i < TAMANHO_VETOR; i++) {
        if (vetor[i] == numeroProcurado) {
          achouNumero = true;
        } 
      }
      return achouNumero;
    }
}
