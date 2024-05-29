public class App {
    public static void main(String[] args) throws Exception {
        Atleta jorgeNetto = new Atleta();
        jorgeNetto.nome = "Jorge Netto";
        jorgeNetto.esporte = "Crossfit";
        jorgeNetto.fazSnatch = true;
        jorgeNetto.fazMuscleUp = false;

        jorgeNetto.imprimirDetalhes();


    }
}
