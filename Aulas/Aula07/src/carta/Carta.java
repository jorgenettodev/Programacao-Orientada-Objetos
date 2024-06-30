package carta;

public class Carta {
    private String nome;
    private boolean revelada;

    public Carta(String nome) {
        this.nome = nome;
    }

    public void revelarCarta() {
        if (revelada) { // se ja estiver revelada, retorna;s
            return;
        }

        revelada = true;
        System.out.println("Nome " + nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean isRevelada() {
        return this.revelada;
    }

    public void exibirInformacoes() {
        System.out.println(String.format(
            """
            Nome: %s
            Revelada: %s
            """, this.nome, this.revelada));
    }
}
