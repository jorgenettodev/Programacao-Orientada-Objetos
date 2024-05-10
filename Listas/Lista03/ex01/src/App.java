import java.util.*;

public class App {
    private static int anoAtual = 2024;
    
    private static Scanner SCAN = new Scanner(System.in);
    
    public static void main(String[] args) {
      int anoNascimento = Integer.parseInt(SCAN.nextLine());
      System.out.println(calcularIdadeAte2024(anoNascimento));
      
  }
    public static String calcularIdadeAte2024(int anoNascimento) {
      int idadeAteOFinalDe2024 = anoAtual - anoNascimento;
      
      return String.format("Ate o final de 2024 voce tera %s anos", idadeAteOFinalDe2024);
    }
}