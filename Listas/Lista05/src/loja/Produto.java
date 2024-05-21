package loja;

public class Produto {
    private String nomeProduto;
    private int preco;

    public Produto(String nomeProduto, int preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public Produto() {

    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getPreco() {
        return preco;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String imprimirDetalhe() {
        return String.format(
                """
                Nome produto: %s
                Preco: %s
                """, nomeProduto, preco);
    }
}
