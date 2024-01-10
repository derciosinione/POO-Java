package heranca;

public class Main {
    public static void main(String[] args) {

        Caes cao = new Caes("Max", "Tonisvaldo","Terrestre", true);
        System.out.println(cao);
        cao.andar();
        cao.ladra();
        cao.Efarejador = true;

        System.out.println("*****************************");

        Gatos gato = new Gatos("pelo pelo", "Joao","Terrestre");
        System.out.println(gato);
        gato.andar();
        gato.miar();
    }
}
