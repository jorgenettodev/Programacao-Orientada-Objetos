package eventos;

public class StandUp extends Evento {
    private String comediante;

    public StandUp(String nome, String local, String data, String comediante) {
        super(nome, local, data);
        setComediante(comediante);
    }

    private void setComediante(String comediante) {
        this.comediante = comediante;
    }

    private String getComediante() {
        return this.comediante;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Nome do comediante: " + getComediante());
    }

    @Override
    public void comecarEvento() {
        System.out.println("O evento de stand up comedy irá começar!");
    }

    public void comecarEvento(String piada) {
        System.out.println("O show de humor começou");
        System.out.println(piada);
    }
}
