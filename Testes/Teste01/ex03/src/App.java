import java.util.*;

public class App {
    private static Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String inputLogin = SCAN.nextLine();
        String inputSenha = SCAN.nextLine();

        boolean estaLogado = fazerLogin(inputLogin, inputSenha);
        System.out.println((estaLogado) ? "Login realizado com sucesso" : "Falha no login");
    }

    public static boolean fazerLogin(String login, String senha) {
        String loginAdm = "admin";
        String senhaAdm = "senha123";

        if (loginAdm.equals(login) && senhaAdm.equals(senha)) {
            return true;
        }
        return false;
    }
}
