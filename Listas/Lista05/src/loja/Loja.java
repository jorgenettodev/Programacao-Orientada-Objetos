package loja;

import java.util.ArrayList;

public class Loja {
    private String nome;
    private String categoriaLoja;
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public Loja(String nome, String tipo) {
        this.nome = nome;
        this.categoriaLoja = tipo;
    }

    public Loja() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoriaLoja(String tipo) {
        this.categoriaLoja = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoriaLoja() {
        return categoriaLoja;
    }

    // add produtos à lista;
    public void addProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    // listar todos os produtos
    public void listarProdutos() {
        for (int i = 0; i < this.listaProdutos.size(); i++) {
            System.out.println(this.listaProdutos.get(i).imprimirDetalhe());
        }
    }

}
