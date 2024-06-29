package pacote;

import java.util.ArrayList;
import java.util.List;

public class Locadora<T extends AudioVisual> {
    // cria uma lista com tipo genérico T (que implementa a interface AudioVisual)
    private List<T> acervo = new ArrayList<>();

    // método para adicionar itens do tipo T ao acervo;
    public void adicionarItem(T item) {
        acervo.add(item);
    }

    public void listarItens() {
        for (T item : acervo) {
            item.exibirInfo();
        }
    }

    public void buscarItem(String titulo) {
        boolean foiEncontrado = false;

        for (T item: acervo) {
            if (item.getTitulo().contains(titulo)) {
                foiEncontrado = true;
            } 
        }
        if (foiEncontrado) {
            System.out.println("O titulo foi encontrado");
        } else {
            System.out.println("Titulo não encontrado");
        }
    }


}
