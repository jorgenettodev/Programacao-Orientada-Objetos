package exceptions;

public class NomeInvalidoException extends Exception {
    public NomeInvalidoException() {
        super("Nome eh obrigatorio");
    }
}
