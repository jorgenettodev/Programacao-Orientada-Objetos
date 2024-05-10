import java.util.*;

public class App {
    private static Scanner SCAN = new Scanner(System.in);
    private static final int QUANTIDADE_TABUADA = 10;
    public static void main(String[] args) throws Exception {
        int inputNumero = SCAN.nextInt();

        for (int i = 0; i < QUANTIDADE_TABUADA; i++) {
            int multiplicador = inputNumero;
            int multiplicando = i+1;
            int produto = multiplicador * multiplicando;
            System.out.println(String.format(
            """
            %s x %s = %s       
            """, 
            multiplicador, multiplicando, produto
            ));
        }
    }
}
