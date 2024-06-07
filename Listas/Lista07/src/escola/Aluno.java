package escola;

public class Aluno extends Usuario {

    private String matricula;

    public Aluno(String nome, String email, String matricula) {
        super(nome, email);
        //TODO Auto-generated constructor stub
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        System.out.println(String.format(
            """
            Nome: %s
            Email: %s
            Matricula: %s
            """
            ,this.getNome(), this.getEmail(), this.getMatricula()));
    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula) {
        if (exibirNome) {
            System.out.println(this.getNome());
        }

        if (exibirEmail) {
            System.out.println(this.getEmail());
        }

        if (exibirMatricula) {
            System.out.println(this.getMatricula());
        }
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    

}
