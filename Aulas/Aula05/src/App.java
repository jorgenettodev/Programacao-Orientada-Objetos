import java.util.ArrayList;

import biblioteca.Biblioteca;
import biblioteca.Livro;
import biblioteca.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Livro cantHurtMe = new Livro("Romeu e Julineta");

        Biblioteca biblioteca = new Biblioteca();

        cantHurtMe.setTitulo("Can't Hurt Me");
        System.out.println(cantHurtMe.getTitulo());

        Usuario usuario = new Usuario();
        usuario.setNome("Netto");
        System.out.println(usuario.getNome());;
    }
}
