package exceptions;

public class PrecoInvalidoException extends Exception {
    public PrecoInvalidoException() {
        super("Preco invalido: Não pode ter um valor negativo ou zero.");
    }
}
