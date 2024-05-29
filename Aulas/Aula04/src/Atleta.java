public class Atleta {
    String nome;
    String esporte;
    boolean fazSnatch;
    boolean fazMuscleUp;

    public void imprimirDetalhes() {
        System.out.println(String.format(
            """
            Nome: %s
            Esporte: %s
            sabe fazer Snatch: %s
            sabe fazer Muscle Up: %s
            """, nome, esporte, fazSnatch, fazMuscleUp));
    }
}
