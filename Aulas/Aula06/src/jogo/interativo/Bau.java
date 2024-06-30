package jogo.interativo;
import jogo.Heroi;

public class Bau implements Interativo{
    private String item;
    private boolean estahTrancado;
    private int raridade;

    public void interagir(Heroi heroi) {
        if (!estahTrancado) {
            System.out.println("Encontrou o item: " + item);
            heroi.getInventario().add(this.item);
        } else {
            System.out.println("Bau trancado, procure uma chave.");
        }
    }
    
}
