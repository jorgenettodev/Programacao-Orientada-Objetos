import java.util.*;

public class App {
    private static Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int inputNumero = Integer.parseInt(SCAN.nextLine());

        if (ehPar(inputNumero)) {
            System.out.println("Eh par");
        } else {
            System.out.println("Nao eh par");
        }
    }

    public static boolean ehPar(int input) {
        return (input % 2 == 0) ? true : false;
    }
}
