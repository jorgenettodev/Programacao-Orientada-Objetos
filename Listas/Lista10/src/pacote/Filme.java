package pacote;

import java.util.ArrayList;
import java.util.List;

public class Filme implements AudioVisual {
    private String titulo;
    private String diretor;
    private List<String> atores = new ArrayList<>();

    public Filme(String titulo, String diretor, List<String> atores) {
        setTitulo(titulo);
        setDiretor(diretor);
        setAtores(atores);
    }

    @Override
    public void exibirInfo() {
        System.out.println(String.format(
            """
            Titulo: %s
            Diretor: %s
            Atores: %s
                """, this.getTitulo(), this.getDiretor(),this.getAtores()
        ));
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public List<String> getAtores() {
        return this.atores;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    };

    

}
