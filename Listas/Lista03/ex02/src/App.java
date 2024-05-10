import java.util.*;

public class App {
    public static int QUANTIDADE_CRITICOS = 3;
    public static int[] vetorNotas = new int[QUANTIDADE_CRITICOS];
    public static Scanner SCAN = new Scanner(System.in);
    
    public static void main(String[] args) {
      recebeNotasCriticos(vetorNotas);
      imprimeMediaNotas(vetorNotas);
  }
    public static void recebeNotasCriticos(int[] vetor) {
      for (int i = 0; i < QUANTIDADE_CRITICOS; i++) {
        vetor[i] = SCAN.nextInt();
      }
    }
    
    public static void imprimeMediaNotas(int[] vetor) {
      int somaNotas = 0;
      int mediaNotas = 0;
      
      for (int i = 0; i < QUANTIDADE_CRITICOS; i++) {
        somaNotas += vetor[i]; 
      }
      
      mediaNotas = somaNotas / QUANTIDADE_CRITICOS;
      
      System.out.println(mediaNotas);
      
    }
}