public abstract class Animal {
    private String nome;
    private String especie;

    public Animal(String especie) {
        setEspecie(especie);
    }

    public void alimentar() {
        System.out.println("Se alimentou");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
}
