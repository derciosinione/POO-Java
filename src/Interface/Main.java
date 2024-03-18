package Interface;

public class Main {
    public static void main(String[] args) {

        Veterinario veterinario1 = new Veterinario(1,"Amor e Paz");
        Veterinario veterinario2 = new Veterinario(2,"Cassia Cuidadora");

        IAnimais cao = new Caes("Max", "Tonisvaldo","Terrestre");
//        System.out.println(cao);
        cao.andar();
        castrarAnimal(cao,true);
        veterinario1.addAnimal(cao);

        IAnimais gato = new Gatos("Anastacia", "Joao","Terrestre");
//        System.out.println(gato);
        gato.andar();
        castrarAnimal(gato,true);
        veterinario1.addAnimal(gato);

        IAnimais leao = new Leao("Leao Mau", "Joao","Terrestre");
//        System.out.println(leao);
        leao.andar();
        castrarAnimal(leao, true);

        System.out.println("\n\n ------ Listando os animais do veterinario 1");
        var animais = veterinario1.visualizarAnimais();


        System.out.println("\n\n ------ Listando os animais do veterinario 2");
        veterinario2.imprimirAnimais();

    }

    private static void castrarAnimal(IAnimais animal, boolean castrar){
        String mensagem = castrar ? "O animal %s foi castrado \n" : "O animal %s nao foi castrado \n";
        System.out.printf(mensagem, animal.getNome());
    }

}
