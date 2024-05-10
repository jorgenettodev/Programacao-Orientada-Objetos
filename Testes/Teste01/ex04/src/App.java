import java.util.*;

public class App {
    private static int QUANTIDADE_PESSOAS = 10;
    private static final Scanner SCAN = new Scanner(System.in);
    private static String[] lista = new String[QUANTIDADE_PESSOAS];
  
    public static void main(String[] args) {
      preencheLista(lista);
      String requisitante = SCAN.nextLine();
      
      buscaRequisitante(requisitante);
  }
    
    public static void preencheLista(String[] vetor) {
      for (int i = 0; i < QUANTIDADE_PESSOAS; i++) {
        vetor[i] = SCAN.nextLine();
      }
    }
    
    public static void buscaRequisitante(String requisitante) {
      boolean encontrouRequisitante = false;
      
      for (int i = 0; i < QUANTIDADE_PESSOAS; i++) {
        if (lista[i].equalsIgnoreCase(requisitante)) {
          encontrouRequisitante = true;
        } 
      }
      
      if (encontrouRequisitante) {
        System.out.println("Requisitante esta na lista. Seja bem vindo!");
      } else {
        System.out.println("Requisitante nao esta na lista. Nao pode entrar na festa");
      }
      
    }
}