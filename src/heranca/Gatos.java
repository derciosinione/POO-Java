package heranca;

public class Gatos extends Animais{

    public Gatos(String nome, String dono, String categoria){
        super(nome,dono, categoria);
    }

    public void miar(){
        System.out.printf("o animal %s esta miar \n", Nome);
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
