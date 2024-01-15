package Interface;

public abstract class Animais implements IAnimais {
    public String Nome;
    public String Dono;
    public String Categoria;
    public int Numero;

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

    public String getNome() {
        return this.Nome;
    }

    public void andar(){
        Numero = 2;
        System.out.printf("(super class) o animal %s esta andar \n", Nome);
    }

    public void comer(){
        System.out.printf("(super class) o animal %s esta comer \n", Nome);
    }

    public void dormir(){
        System.out.printf("(super class) o animal %s esta dormir \n", Nome);
    }

    public void pular() {

    }

}
