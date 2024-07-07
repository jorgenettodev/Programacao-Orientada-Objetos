public class Pessoa {
    private String cpf;
    private String nome;

    public Pessoa(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Pessoa) {
            Pessoa pessoa = (Pessoa) object;
            if (pessoa.cpf.equals(this.cpf)) {
                return true;
            }
        }
        return false;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
