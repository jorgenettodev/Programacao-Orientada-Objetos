import java.util.ArrayList;
import java.util.List;

import carta.Carta;
import carta.CartaExplosao;

public class App {
    public static void main(String[] args) throws Exception {
        Carta cartaExplosao = new CartaExplosao();

        List<Carta> cartas = new ArrayList<>();

        Carta cartaExplosiva = new CartaExplosao();
        cartaExplosiva.setNome("Carta que explode");

        cartaExplosiva.exibirInformacoes();

        cartas.add(cartaExplosiva);
    }
}
