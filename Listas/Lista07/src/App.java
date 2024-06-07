import escola.Aluno;
import escola.Usuario;
import escola.Professor;

public class App {
    public static void main(String[] args) throws Exception {

        Aluno aluno = new Aluno("Netto", "netto@email.com", "1234nnn");

        aluno.exibirInfo();
        aluno.exibirInfo(true, false, false);

        Professor professor = new Professor("João", "joaoProfessor@email.com", "POO");

        professor.exibirInfo();
        professor.exibirInfo(true, true, false);
    }
    
}
