package carta;

public class CartaExplosao extends Carta{

    public CartaExplosao() {
        super("Explosão");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(String.format("""
                Nome: %s
                Revelada: %s
                Ação da carta: Explode o jogador
                """, this.getNome(), this.isRevelada()));
    }
}
