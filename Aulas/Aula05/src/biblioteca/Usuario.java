package biblioteca;

public class Usuario {
    private String nome;
    private int idade;

    public void setIdade(int idade) {
       if (idade < 12) {
        System.out.println("Muito novo");
        return;
       }
       this.idade = idade;
    }
    public void setNome(String nome) {
        if (nome.equalsIgnoreCase("Patrick")) {
            System.out.println("Patrick não pode mané");
            return;
        }
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

}
