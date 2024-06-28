package pacote;

public class Jogo implements AudioVisual {
    private String titulo;
    private String plataforma;

    public Jogo(String titulo, String plataforma) {
        setTitulo(titulo);
        setPlataforma(plataforma);

    }

    @Override
    public void exibirInfo() {
       System.out.println(String.format(
        """
               Titulo: %s
               Plataforma: %s
               """, this.getTitulo(), this.getPlataforma()));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    

}
