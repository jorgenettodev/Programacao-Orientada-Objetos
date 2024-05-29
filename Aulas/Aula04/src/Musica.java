import java.util.ArrayList;

public class Musica {
    String melodia;
    String letra;
    boolean temLetra;
    ArrayList<Musico> musicos = new ArrayList();
    String nome;

    public void ouvir() {
        for (int i = 0; i < musicos.size(); i++) {
            musicos.get(i).tocarMusica();

            if (musicos.get(i).ehCantor) {
                System.out.println(musicos.get(i).nome);
                musicos.get(i).cantar();
            }
        }
    }

    public void imprimirDetalhes() {
        System.out.println(nome);
        System.out.println(letra);

        for (Musico musico : musicos) {
            musico.imprimirDetalhes();
        }

    }
}
