package escola;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void exibirInfo() {
        System.out.println(String.format(
            """
            Nome: %s
            Email: %s
            """, 
            getNome(), getEmail()));
    }

    // getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

}
