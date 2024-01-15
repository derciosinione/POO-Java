package Interface;

public class Leao extends AnimaisSelvagens{
    public Leao(String nome, String dono, String categoria) {
        super(nome, dono, categoria);
    }

    public Leao(String nome, String categoria) {
        super(nome, categoria);
    }

    public Leao(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Leao{" +
                "Nome='" + Nome + '\'' +
                ", Dono='" + Dono + '\'' +
                ", Categoria='" + Categoria + '\'' +
                '}';
    }
}
