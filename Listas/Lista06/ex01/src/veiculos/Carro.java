package veiculos;

public class Carro implements Veiculo {
    private String marca;
    private String modelo;

    // constructor
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // getters e setters
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

    // metodos
    public void acelerar() {
        System.out.println("acelerando o carro: vrummmmmmmm");
    }

    public void frear() {
        System.out.println("freando carro: shhhhhhhhhh");
    }
}
