package quiz;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import quiz.exceptions.AlternativaInvalidaException;

@AllArgsConstructor
@Setter
@RequiredArgsConstructor
@Getter

public class Questao {
    private final String conteudo;
    private Map<Integer, Alternativa> alternativas = new LinkedHashMap<>();
    private Alternativa alternativaCorreta;

    private void imprimirConteudo() {
        System.out.println(conteudo);
    }

    private void imprimirAlternativas() {
        for (Entry<Integer, Alternativa> alternativa : alternativas.entrySet()) {
            System.out.println(alternativa.getKey() + ": " + alternativa.getValue().getConteudo());
        }
    }

    public void imprimirQuestao() {
        imprimirConteudo();
        imprimirAlternativas();
    }

    public Alternativa buscarAlternativa(int numeroAlternativa) throws AlternativaInvalidaException {
        Alternativa alternativa = this.alternativas.get(numeroAlternativa);

        if (alternativa != null) {
            return alternativa;
        }

        throw new AlternativaInvalidaException();
    }

    public void setAlternativas(Map<Integer, Alternativa> alternativas, Alternativa alternativaCorreta) {
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
    }


}
