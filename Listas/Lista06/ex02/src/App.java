import animais.Cachorro;
import animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        Gato batatinha = new Gato("Batatinha", "Amarelo alaranjado");
        batatinha.comer();
        batatinha.emitirSom();

        Cachorro bidu = new Cachorro("Bidu", "Viralata");
        bidu.comer();
        bidu.emitirSom();
    }
}
