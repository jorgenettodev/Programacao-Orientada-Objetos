import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        do
        {
            try {
                System.out.println("type your name: ");
                Pessoa pessoa = new Pessoa(scanner.nextLine());
                System.out.println(pessoa.getNome());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        System.out.println("Fim do programa");
    }
}
