public class Aviao {
    String marca;
    String modelo;
    String velocidade;
    Aeroporto aeroporto;

    public void imprimirDetalhes() {
        System.out.println(String.format(
        """
        Marca: %s
        Modelo: %s
        Velocidade: %s
        """,
        marca, modelo, velocidade));
    }

    public void voarEmVelocidadeDeCruzeiro() {
        System.out.println(String.format("Este modelo %s está voando há %s km/h", velocidade));
    }

    public void pousar() {
        System.out.println(String.format("O %s da %s está pousando na pista em operação.", modelo, marca));
    }
}
