package eventos;

import java.util.ArrayList;
import java.util.List;

public class Show extends Evento{
    private List<String> artistas = new ArrayList<>();

    public Show(String nome, String local, String data, List<String> artistas) {
        super(nome, local, data);
        this.artistas.addAll(artistas);
    }

    public void comecarEvento() {
        System.out.println(String.format(
            """
                Hora do show %s!!!!!
                """, this.getNome()));
    }

    public void comecarEvento(boolean comAplausos) {
        if (comAplausos) {
            System.out.println("Aplausos!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("CLAP CLAP CLAP");
            this.comecarEvento();
            return;
        }

        System.out.println("Sem aplausos");
        this.comecarEvento();
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // exibe as informações originais
        exibirArtistas(); //mostra também os artistas.
    }

    public void exibirArtistas() {
        for (String artista: artistas) {
            System.out.println("Artista: " + artista);
        }
    }
}