public class Musico {
    String nome;
    int idade;
    String instrumento;
    boolean ehCantor;

    public void imprimirDetalhes() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(instrumento);
        System.out.println(ehCantor);
    }

    public void dizerOla() {
        System.out.println(String.format("Ola, meu nome eh ", nome));
    }

    public void tocarMusica() {
        System.out.println("Tirando um som :)");
    }

    public void cantar() {
        if (ehCantor) {
            System.out.println("Laiala laiala laialá");
        } else {
            System.out.println("Nuem sei cantar :(");
        }
    }
}
