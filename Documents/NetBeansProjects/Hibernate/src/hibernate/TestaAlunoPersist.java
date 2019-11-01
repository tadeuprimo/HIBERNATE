package hibernate;

public class TestaAlunoPersist {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.setNome("Matheus");
        a1.setIdade(47);
        a1.setMatricula("1111");

        AlunoPersist ap = new AlunoPersist();

        ap.salvar(a1);

    }
}
