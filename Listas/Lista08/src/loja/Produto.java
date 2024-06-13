package loja;

import exceptions.NomeInvalidoException;
import exceptions.PrecoInvalidoException;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws Exception {
        setNome(nome);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if (!(nome.length() < 3)) { // se o nome NÃO FOR menor do que 3
            this.nome = nome;
            return;
        }

        throw new NomeInvalidoException();
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws PrecoInvalidoException {
        if (!(preco < 0)) {
            this.preco = preco;
            return;
        }

        throw new PrecoInvalidoException();
    }

    
}
