import eventos.Show;
import eventos.StandUp;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> artistasDoShow = new ArrayList<>();
        artistasDoShow.add("cpm 22");
        artistasDoShow.add("fresno");
        artistasDoShow.add("nx zero");

        Show show = new Show("Festival de Rock Anos 2000", "Teatro Theo Brandao", "04 de Julho de 2024", artistasDoShow);
        show.exibirInformacoes();

        show.comecarEvento();
        show.comecarEvento(true);


        StandUp standUp = new StandUp("É de mim mesmo", "Piauí", "xx/xx/2024", "Whindersson Nunes");
        standUp.exibirInformacoes();
        standUp.comecarEvento("Piada de pobre x rico");
        standUp.comecarEvento();

    }
}
