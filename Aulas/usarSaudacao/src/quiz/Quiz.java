package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import quiz.exceptions.AlternativaInvalidaException;

@Setter
@Getter
@AllArgsConstructor

public class Quiz {
    private String participante;
    private int quantidadeAcertos = 0;
    private List<Questao> questoes;

    public Quiz(String participante, List <Questao>questoes) {
        setParticipante(participante);
        setQuestoes(questoes);
    }

    public void realizarQuiz() {
        for (Questao questao : questoes) {
            questao.imprimirQuestao();
            Alternativa alternativa = buscarAlternativa(questao);
            verificarSeParticipanteAcertou(alternativa, questao);
        }
        encerrarQuiz();
    }

    private int receberResposta() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    private Alternativa buscarAlternativa(Questao questao) {
        do {
            try {
                return questao.buscarAlternativa(receberResposta());
            } catch (AlternativaInvalidaException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    private void verificarSeParticipanteAcertou(Alternativa alternativa, Questao questao) {
        if (alternativa.equals(questao.getAlternativaCorreta())) {
            quantidadeAcertos++;
        }
    }

    private void iniciarQuiz() {
        System.out.println("Vamos começar, " + participante);
    }

    private void encerrarQuiz() {
        StringBuilder mensagemFinal = new StringBuilder();
        mensagemFinal.append(participante).append(",");

        if (quantidadeAcertos == 0) {
            mensagemFinal.append("Você errou tudo man");
        } else if (quantidadeAcertos == questoes.size()) {
            mensagemFinal.append(("Estou! ACertou foi tudo"));
        } else if (quantidadeAcertos >= questoes.size() / 2) {
            mensagemFinal.append("GG izi");
        } else {
            mensagemFinal.append("errou feio, errou rude");
        }
        mensagemFinal.append("\n").append("Acertou: ").append(quantidadeAcertos);
        mensagemFinal.append("\n").append("Quantidade de perguntas: ").append(questoes.size());

        System.err.println(mensagemFinal);
    }
}
