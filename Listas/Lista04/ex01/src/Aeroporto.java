public class Aeroporto {
    String nome;
    String nomeDaPistaEmOperacao;
    String cidade;

    public void informaPistaEmOperacao() {
        System.out.println(String.format("Bom dia Piloto, a pista em operacao eh a %s", nomeDaPistaEmOperacao));
    }

    public void imprimirDetalhes() {
        System.out.println(String.format(
            """
            Nome do aeroporto: %s
            Pista em Operacao:%s
            Cidade:%s
            """, nome, nomeDaPistaEmOperacao, cidade));
    }


}
