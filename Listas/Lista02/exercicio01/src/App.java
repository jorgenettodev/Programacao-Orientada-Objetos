import java.util.Scanner;

public class App {
    // * variáveis globais
    private static int QUANTIDADE_PERGUNTAS = 3;
    private static String[] respostasUsuario = new String[QUANTIDADE_PERGUNTAS];
    private static String[] gabarito = new String[QUANTIDADE_PERGUNTAS];
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // for (int i = 0; i < QUANTIDADE_PERGUNTAS; i++) {
        // respostasUsuario[i] = SCAN.nextLine();
        // }

        // for (int i = 0; i <respostasUsuario.length; i++) {
        // System.out.println(respostasUsuario[i]);
        // }
        String nomeUsuario = recebeNome();
        iniciarQuiz(nomeUsuario);
        perguntarPrimeiraQuestao();
        perguntarSegundaQuestao();
        perguntarTerceiraQuestao();
        apresentarResultado(nomeUsuario);
    }

    public static String formataNome(String nome) {

        nome = nome.trim();
        String primeiraLetra = nome.substring(0, 1);
        primeiraLetra = primeiraLetra.toUpperCase();
        String restoDoNome = nome.substring(1);
        restoDoNome = restoDoNome.toLowerCase();
        String nomeFormatado = primeiraLetra + restoDoNome;

        return nomeFormatado;
    }

    public static String recebeNome() {
        System.out.println(
                """
                        Bem-vindo, digite seu nome:
                        """);
        String nome = SCAN.nextLine();
        nome = formataNome(nome);
        return nome;
    }

    public static void iniciarQuiz(String nomeParticipante) {
        System.out.println(String.format(
                """
                Olá, %s
                Vamos começar nosso quiz, 
                As questões são de multipla escolha e você só pode escolher as disponíveis.
                e também, você não pode deixar em branco as respostas.

                Aperte ENTER para iniciar o quiz.
                """,
                nomeParticipante
        ));

        SCAN.nextLine();
        // perguntarPrimeiraQuestao();
    }

    public static void perguntarPrimeiraQuestao() {
        String resposta = "";
        do {
            System.out.println(
                """
                1 - No jogo Subnautica, qual o nome do planeta em que caímos ?

                A - Terra
                B - Marte
                C - 4546B

                """
            );
            resposta = SCAN.nextLine();
        } while(!ehUmaRespostaValida(resposta));

        String gabaritoPrimeiraPergunta = "c";
        respostasUsuario[0] = resposta;
        gabarito[0] = gabaritoPrimeiraPergunta;
    }

    public static void perguntarSegundaQuestao() {
        String resposta = "";
        do {
            System.out.println(
                """
                2 - No jogo Subnautica, qual o nome das criaturas gigantes ?

                A - Leviathans
                B - Dragões
                C - Monstros

                """
            );
            resposta = SCAN.nextLine();
        } while(!ehUmaRespostaValida(resposta));
        String gabaritoSegundaPergunta = "a";
        respostasUsuario[1] = resposta;
        gabarito[1] = gabaritoSegundaPergunta;
    }

    public static void perguntarTerceiraQuestao() {
        String resposta = "";
        do {
            System.out.println(
                """
                3 - No jogo Subnautica, qual o nome do personagem principal? ?

                A - Jack
                B - Riley
                C - Joe

                """
            );
            resposta = SCAN.nextLine();
        } while(!ehUmaRespostaValida(resposta));

        String gabaritoTerceiraPergunta = "b";
        respostasUsuario[2] = resposta;
        gabarito[2] = gabaritoTerceiraPergunta;
    }

    public static boolean ehUmaRespostaValida(String resposta) {
        if (resposta.isBlank()) {
            System.out.println(
                """
                Você deixou em branco, tente novamente.    
                """
            );
            return false;
        }
        return true;
    }

    public static void apresentarResultado(String nomeParticipante) {
        System.out.println(String.format(
            """
            Caro %s, vamos ver como foram os teus resultados:
            """
            ,nomeParticipante));
        
        for (int i = 0; i < QUANTIDADE_PERGUNTAS; i++) {
            System.out.println(String.format(
            "%s - %s",
            (i + 1), 
            respostasUsuario[i].equalsIgnoreCase(gabarito[i]) ? "ACERTOU" : "ERROU"
            ));
        }
    }
}
