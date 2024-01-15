package Interface;

public class Main {
    public static void main(String[] args) {
        Caes cao = new Caes("Max", "Tonisvaldo","Terrestre");
        System.out.println(cao);
        cao.andar();
        castrarAnimal(cao,true);

        Gatos gato = new Gatos("Anastacia", "Joao","Terrestre");
        System.out.println(gato);
        gato.andar();
        castrarAnimal(gato,false);
    }

    private static void castrarAnimal(IAnimais animal, boolean castrar){
        String mensagem = castrar ? "O animal %s foi castrado \n" : "O animal %s nao foi castrado \n";
        System.out.printf(mensagem, animal.getNome());
    }
}
