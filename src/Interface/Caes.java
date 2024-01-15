package Interface;

public class Caes extends Animais {

    public Caes(String nome, String dono, String categoria) {
        super(nome, dono, categoria);
    }

    public Caes(String nome, String categoria) {
        super(nome, categoria);
    }

    public Caes(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Cao {" +
                "Nome='" + Nome + '\'' +
                ", Dono='" + Dono + '\'' +
                ", Categoria='" + Categoria + '\'' +
                '}';
    }
}
