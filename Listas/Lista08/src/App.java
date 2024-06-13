import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {

        Produto produtoValido = new Produto("Bola de Volei", 229.90);

        try {
            Produto produto1 = new Produto("Bo", 150.0);
            System.out.println(produto1.getNome());;

        } catch (Exception e) {
            System.out.println(e.getMessage());;
        };

        try {
            Produto produto2 = new Produto("Sabonete liquido", -50);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
