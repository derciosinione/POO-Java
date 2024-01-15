package Interface;

public class Main {
    public static void main(String[] args) {
        IAnimais cao = new Caes("Max", "Tonisvaldo","Terrestre");
        System.out.println(cao);
        cao.andar();
        castrarAnimal(cao,true);

        IAnimais gato = new Gatos("Anastacia", "Joao","Terrestre");
        System.out.println(gato);
        gato.andar();
        castrarAnimal(gato,true);

        IAnimais leao = new Leao("Leao Mau", "Joao","Terrestre");
        System.out.println(leao);
        leao.andar();
        castrarAnimal(leao, true);
    }

    private static void castrarAnimal(IAnimais animal, boolean castrar){
        String mensagem = castrar ? "O animal %s foi castrado \n" : "O animal %s nao foi castrado \n";
        System.out.printf(mensagem, animal.getNome());
    }

}
