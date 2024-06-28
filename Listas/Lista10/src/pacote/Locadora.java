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
        for (T item: acervo) {
            if (((Filme) item).getTitulo().contains(titulo)) {
                System.out.println(String.format("O item %s foi encotrado",((Filme) item).getTitulo()));
            }
        }
    }


}
