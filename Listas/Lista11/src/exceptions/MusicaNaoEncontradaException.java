package exceptions;

public class MusicaNaoEncontradaException extends RuntimeException {
    public MusicaNaoEncontradaException() {
        super("Musica não encontrada");
    }
}
