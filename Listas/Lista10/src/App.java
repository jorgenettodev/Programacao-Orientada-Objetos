import java.util.ArrayList;
import java.util.List;

import pacote.Filme;
import pacote.Jogo;
import pacote.Locadora;

public class App {
    public static void main(String[] args) throws Exception {
        // filme
        List<String> atoresFilme1 = new ArrayList<>();
        atoresFilme1.add("Matheew Macoughnahay");
        atoresFilme1.add("anne hattaway");
        Filme filme1 = new Filme("Interestelar", "Cristopher Nolan", atoresFilme1);

        // jogo
        Jogo jogo = new Jogo("Life is Strange", "PC, Xbox e Playstation");

        // locadora
        Locadora locadora = new Locadora();
        // locadora.adicionarItem(jogo);
        locadora.adicionarItem(filme1);

        // locadora.listarItens();
        locadora.buscarItem("Interestelar");
    }
}
