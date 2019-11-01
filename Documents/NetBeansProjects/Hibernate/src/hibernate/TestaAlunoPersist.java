package hibernate;

public class TestaAlunoPersist {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.setNome("Matheus");
        a1.setIdade(47);
        a1.setMatricula("1111");
        
        Aluno a2 = new Aluno();
        a2.setNome("Breno");
        a2.setIdade(31);
        a2.setMatricula("2222");


        AlunoPersist ap = new AlunoPersist();

        //ap.salvar(a1);
        //ap.salvar(a2);
        ap.remover(a1);
        ap.remover(a2);

    }
}
