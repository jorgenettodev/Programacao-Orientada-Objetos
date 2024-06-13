package exceptions;

public class NomeInvalidoException extends Exception {
    public NomeInvalidoException() {
        super("Nome deve ter no mínimo 3 caracteres.");
    }
}
