import java.util.HashMap;
import java.util.Map;
import exceptions.*;

public class BibliotecaMusical extends MusicaNaoEncontradaException {
    private Map<String, Musica> acervo = new HashMap<>();

    public void adicionarMusica(String titulo, Musica musica) {
        acervo.put(titulo, musica);
    }

    public void listarMusicas() {
        System.out.println(acervo.values());
    }

    public void buscarMusica(String titulo) throws MusicaNaoEncontradaException {
        Musica musica = acervo.get(titulo);

        if (musica == null) {
            throw new MusicaNaoEncontradaException();
        }

        System.out.println("Titulo encontrado");
        System.out.println(musica);
    }

    public void setAcervo(Map<String, Musica> acervo) {
        this.acervo = acervo;
    }

    public Map<String, Musica> getAcervo() {
        return this.acervo;
    }
}
