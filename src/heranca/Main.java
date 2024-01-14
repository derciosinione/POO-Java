package heranca;

public class Main {
    public static void main(String[] args) {

        Caes cao = new Caes("Max", "Tonisvaldo","Terrestre", true);
        System.out.println(cao);
        cao.ladra();
        cao.andar();
        cao.Efarejador = true;

        System.out.println("**********************************************************");

        Gatos gato = new Gatos("Anastacia", "Joao","Terrestre");
        System.out.println(gato);
        gato.miar();
        gato.andar();

        System.out.println("Numero: "+ gato.Numero);

    }
}
