import java.util.*;

public class App {
    public static final Scanner SCAN = new Scanner(System.in);
    
    public static void main(String[] args) {
      String palavraA = SCAN.nextLine();
      String palavraB = SCAN.nextLine();
      
      comparaPalavras(palavraA, palavraB);
  }
    public static void comparaPalavras(String palavraA, String palavraB) {
      if (palavraA.equals(palavraB)) {
        System.out.println("As palavras sao identicas");
        return;
      } else if (palavraA.equalsIgnoreCase(palavraB)) {
        System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");
        return;
      } else {
        System.out.println("As palavras sao diferentes");
        return;
      }
    }
}