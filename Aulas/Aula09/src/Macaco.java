public class Macaco extends Animal {
    private boolean estahPendurado = false;

    public Macaco() {
        super("Mamaco");
    }

    




    @Override
    public void alimentar() {
        System.out.println(String.format("Este %s se alimentou", this.getEspecie()));
    }


    public boolean isEstahPendurado() {
        return estahPendurado;
    }

    public void setEstahPendurado(boolean estahPendurado) {
        this.estahPendurado = estahPendurado;
    }


}
