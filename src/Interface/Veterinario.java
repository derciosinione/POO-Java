package Interface;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private int Id;
    private String nome;

    private List<IAnimais> listaAnimais;

    public Veterinario(int id, String nome) {
        Id = id;
        this.nome = nome;
        listaAnimais = new ArrayList<IAnimais>();
    }

    public String getNome() {
        return nome;
    }

    public List<IAnimais> visualizarAnimais() {
        return listaAnimais;
    }

    public void addAnimal(IAnimais animal) {
        listaAnimais.add(animal);
    }

    public void imprimirAnimais(){
        for (var animal : listaAnimais){
            System.out.println(animal.getNome());
        }
    }
}
