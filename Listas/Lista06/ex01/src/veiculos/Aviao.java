package veiculos;

public class Aviao implements Veiculo {
    private String marca;
    private String modelo;

    public Aviao(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void acelerar() {
        System.out.println(String.format(
                """
                O avião %s está decolando: zuuummmmm
                """,
                this.modelo));
    }

    public void frear() {
        System.out.println(String.format(
            """
            %s freando: shhhhhhhh
            """
            ,this.modelo));
    }
}
