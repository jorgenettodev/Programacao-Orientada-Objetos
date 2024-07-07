import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // crie uma lista de bombons
        List<Bombom> bombons = new ArrayList<>();


        Bombom bombom = new Bombom("Ouro Branco");
        bombons.add(bombom);

        Bombom bombom2 = new Bombom("Sonho de valsa");
        bombons.add(bombom2);
        
        for (Bombom bombomDaCaixa : bombons) {
            System.out.println(bombomDaCaixa);
        }

    }
}
