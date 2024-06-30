import exceptions.MusicaNaoEncontradaException;

public class App {
    public static void main(String[] args) throws Exception {
        Musica musica = new Musica("Here without you", "3 Doors Down", "Rock Light");
        Musica musica2 = new Musica("Leave out all the rest", "Linkin Park", "Meteora");

        BibliotecaMusical biblioteca = new BibliotecaMusical();
        biblioteca.adicionarMusica(musica.getTitulo(), musica);
        biblioteca.adicionarMusica(musica2.getTitulo(), musica2);
        
        biblioteca.listarMusicas();


        // biblioteca.buscarMusica("Leave out all the rest");
        try {
            biblioteca.buscarMusica("in the end");
        } catch (MusicaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
        }
}
