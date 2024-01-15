package Interface;

public class Gatos extends Animais {

    public Gatos(String nome, String dono, String categoria){
        super(nome,dono, categoria);
    }

    @Override
    public void andar() {
        Numero += 10;
        System.out.printf("o animal %s esta andar a dancar \n", Nome);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "Nome='" + Nome + '\'' +
                ", Dono='" + Dono + '\'' +
                ", Categoria='" + Categoria + '\'' +
                '}';
    }
}
