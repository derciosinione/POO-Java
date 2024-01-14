package heranca;

public class Caes extends Animais {
    public boolean Efarejador;

    public Caes(String nome, String dono, String categoria, boolean eFarejador) {
        super(nome, dono, categoria);
        this.Efarejador = eFarejador;
    }

    public Caes(String nome, String categoria) {
        super(nome, categoria);
    }

    public Caes(String nome) {
        super(nome);
    }

    public void ladra(){
        System.out.printf("o animal %s esta ladrar \n", Nome);
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
