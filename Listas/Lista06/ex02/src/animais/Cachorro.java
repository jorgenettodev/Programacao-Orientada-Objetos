package animais;

public class Cachorro implements Animal {
    private String nome;
    private String raca;

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void comer() {
        System.out.println(String.format("O dogguinho %s está comendo.", this.nome));
    }

    public void emitirSom() {
        System.out.println(String.format("%s says: au-au", this.nome));
    }
}
