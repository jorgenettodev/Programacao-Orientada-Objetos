public class App {
    public static void main(String[] args) throws Exception {
        Corrida corrida = new Corrida();
        corrida.nome = "Corrida de rua";
        corrida.distancia = 5;
        corrida.quantidadeParticipantes = 15000;


        Aeroporto aeroporto = new Aeroporto();
        aeroporto.nome = "Salgado Filho";
        aeroporto.nomeDaPistaEmOperacao = "21L";
        aeroporto.cidade = "Porto Alegre";

        Aviao aviao = new Aviao();
        aviao.marca = "Boeing";
        aviao.velocidade = "850 km/h";
        aviao.modelo = "737 Max";


        corrida.imprimirDetalhes();
        aviao.imprimirDetalhes();
        aeroporto.imprimirDetalhes();
    }
}
