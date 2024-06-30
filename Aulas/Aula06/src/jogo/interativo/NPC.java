package jogo.interativo;

import java.util.ArrayList;
import java.util.Random;

import jogo.Heroi;

public class NPC implements Interativo{
    private ArrayList<String> falas = new ArrayList<>(); // inicializa o arraylist;
    private String localizacao;


    public void interagir() {
        Random random = new Random();
        int indiceDaFala = random.nextInt(falas.size()); // gera um numero aleatorio de 0 até o tamanho do arraylist falas;
        System.out.println(); // pula uma linha
    }


    @Override
    public void interagir(Heroi heroi) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'interagir'");
    }
}
