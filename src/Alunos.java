public class Alunos {
    String Nome;
    double Nota1;
    double Nota2;
    double Media;

    public Alunos(String nome) {
        this.Nome = nome;
    }

    public void adicionarPrimeiraNota(double nota){
        Nota1 = nota;
    }

    public void adicionarSegundaNota(double nota){
        Nota2 = nota;
    }

    public double calcularMedia(){
        Media = (Nota1 + Nota2)/2;
        return Media;
    }

}
