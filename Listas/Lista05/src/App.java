import loja.*;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia loja
        Loja pizzariaDoGamesEdu = new Loja();
        pizzariaDoGamesEdu.setNome("Pizzaria do GamesEduUUuUu");
        pizzariaDoGamesEdu.setCategoriaLoja("Pizzaria");
        
        // instancia produtos
        Produto pizzaDeCalabresa = new Produto();
        pizzaDeCalabresa.setNomeProduto("Pizza de Calabresa");
        pizzaDeCalabresa.setPreco(65);

        Produto pizzaDeFrango = new Produto();
        pizzaDeFrango.setNomeProduto("Pizza de Frango com Catupiri");
        pizzaDeFrango.setPreco(55);

        Produto pizzaQuatroQueijos = new Produto();
        pizzaQuatroQueijos.setNomeProduto("Pizza de 4 Queijos");
        pizzaQuatroQueijos.setPreco(65);



        // add produtos à lista
        pizzariaDoGamesEdu.addProduto(pizzaDeCalabresa);
        pizzariaDoGamesEdu.addProduto(pizzaDeFrango);
        pizzariaDoGamesEdu.addProduto(pizzaQuatroQueijos);

        // listar produtos
        pizzariaDoGamesEdu.listarProdutos();
    }
}
