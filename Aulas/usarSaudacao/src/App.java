import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import quiz.Alternativa;
import quiz.Questao;
import quiz.Quiz;

public class App {
   public static void main(String[] args) {
      List<Questao> questoes = new ArrayList<>();

      Questao questao1 = new Questao("Quantas semanas durou o módulo 2?");
      Map<Integer, Alternativa> alternativasQuestao1 = new LinkedHashMap<>();
      Alternativa alternativa1Questao1 = new Alternativa("10");
      Alternativa alternativa2Questao1 = new Alternativa("365");
      Alternativa alternativa3Questao1 = new Alternativa("12");

      alternativasQuestao1.put(1, alternativa1Questao1);
      alternativasQuestao1.put(2, alternativa2Questao1);
      alternativasQuestao1.put(3, alternativa3Questao1);

      questao1.setAlternativas(alternativasQuestao1, alternativa3Questao1);
      questoes.add(questao1);
      Scanner scanner = new Scanner(System.in);

      Quiz quiz = new Quiz(scanner.nextLine(), questoes);
      quiz.realizarQuiz();
   }
}
