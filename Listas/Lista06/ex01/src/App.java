import veiculos.*;

public class App {
    public static void main(String[] args) throws Exception {
        Carro ecoesport = new Carro("Ford", "Ecosport");
        ecoesport.acelerar();
        ecoesport.frear();

        Aviao boeing737 = new Aviao("Boeing","737-max");
        boeing737.acelerar();
        boeing737.frear();
    }
}
