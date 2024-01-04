public class Main {
    public static void main(String[] args) {
        Alunos aluno = new Alunos("Dercio");
        aluno.Nome = "Cassia";
        aluno.adicionarPrimeiraNota(12);
        aluno.adicionarSegundaNota(14);
        double mediaCalculada = aluno.calcularMedia();
        System.out.println("A media do aluno "+ aluno.Nome +" eh "+ mediaCalculada);
    }
}