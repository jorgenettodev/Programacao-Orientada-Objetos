package animais;

public class Gato implements Animal{
    private String nome;
    private String cor;

    public Gato(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho() {
        this.cor = cor;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCor() {
        return this.cor;
    }

    public void comer() {
        System.out.println(String.format("O gatinho %s está comendo.",this.nome));
    }

    public void emitirSom() {
        System.out.println(String.format("%s says: miau miau",this.nome));
    }

}
