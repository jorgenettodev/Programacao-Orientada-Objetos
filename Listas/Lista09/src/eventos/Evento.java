package eventos;

public abstract class Evento {
    private String nome;
    private String local;
    private String data;

    public Evento(String nome, String local, String data) {
        setNome(nome);
        setLocal(local);
        setData(data);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void exibirInformacoes() {
        System.out.println(String.format(
            """
            Nome do evento: %s
            Local: %s
            Data: %s
            """,
            this.getNome(),
            this.getLocal(),
            this.getData()));
    }

    public abstract void comecarEvento();

}
