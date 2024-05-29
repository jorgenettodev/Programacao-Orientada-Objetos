package biblioteca;

public class Livro {
    private String autor;
    private String titulo;
    private int numeroPaginas;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        if (autor.isBlank()) {
            this.autor = "Deconhecido";
        } else {
            this.autor = autor;
        }
    }

    public String getAutor() {
        return this.autor;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
