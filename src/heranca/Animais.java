package heranca;

public class Animais {
    public String Nome;
    public String Dono;
    public String Categoria;

    public Animais(String nome, String dono, String categoria) {
        Nome = nome;
        Dono = dono;
        Categoria = categoria;
    }

    public Animais(String nome, String categoria) {
        Nome = nome;
        Categoria = categoria;
    }

    public Animais(String nome) {
        Nome = nome;
    }

    public void andar(){
        System.out.printf("o animal %s esta andar \n", Nome);
    }

    public void comer(){
        System.out.printf("o animal %s esta comer \n", Nome);
    }

    public void dormir(){
        System.out.printf("o animal %s esta dormir \n", Nome);
    }

}
