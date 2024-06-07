package escola;

public class Professor extends Usuario {
    private String disciplina;

    public Professor(String nome, String email, String disciplina) {
        super(nome, email);
        //TODO Auto-generated constructor stub

        this.disciplina = disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    @Override
    public void exibirInfo() {
        System.out.println(String.format(
            """
            Nome: %s
            Email: %s
            Disciplina: %s
            """, 
            this.getNome(), this.getEmail(), this.getDisciplina()
            ));
    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirDisciplina) {
        if (exibirNome) {
            System.out.println(String.format(
                """
                Nome: %s
                """, 
                this.getNome()));
        }

        if (exibirEmail) {
            System.out.println(String.format(
                """
                Email: %s
                """, 
                this.getEmail()));
        }

        if (exibirDisciplina) {
            System.out.println(String.format(
                """
                Disciplina: %s
                """, 
                this.getDisciplina()));
        }
    }


    
}
