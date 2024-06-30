import exceptions.NomeInvalidoException;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){}

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome ) throws NomeInvalidoException {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if (!nome.isBlank()) {
            this.nome = nome;
        } else {
            throw new NomeInvalidoException();
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
