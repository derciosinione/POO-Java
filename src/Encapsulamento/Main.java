package Encapsulamento;


import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        InformarOrcamento(orcamento);
        MostrarPrevisao(orcamento);
    }

    private static void InformarOrcamento(Orcamento orcamento) {
        double valor;
        System.out.printf(" 1: Semanal \n 2: Mensal \n Informe o tipo de orcamento desejado: ");
        int ops = scanner.nextInt();

        switch (ops){
            case 1:
                System.out.printf("Informe o valor que recebe semanalemente: ");
                valor = scanner.nextDouble();
                orcamento.setValorSemanal(valor);
                break;
            case 2:
                System.out.printf("Informe o valor que recebe mensalmente: ");
                valor = scanner.nextDouble();
                orcamento.setValorMensal(valor);
                break;
            default:
                System.out.println("Opcao invalida tente novamente!!!");
        }
    }

    private static void MostrarPrevisao(Orcamento orcamento){
        double valorDaPrevisao = 0;
        int anos=0;

        System.out.printf("Deseja uma previsao anual (y/n)? ");
        String opcao = scanner.next();

        if (opcao.toLowerCase().equals("y")){
            System.out.printf("Informe quantos anos pretende para previsao: ");
            anos = scanner.nextInt();
            valorDaPrevisao = orcamento.valorDaPrevisaoAnual(anos);
        }

        printOrcamento(orcamento, valorDaPrevisao, anos);
    }
    public static void printOrcamento(Orcamento value, double valorDaPrevisao, int anos){
        System.out.println("O valor que recebe durante a semana eh: "+ value.getValorSemanal());
        System.out.println("O valor que recebe durante o mes eh: "+ value.getValorMensal());
        System.out.println("O valor que recebe durante o ano eh: "+ value.getValorAnual());
        System.out.println("O valor da previsao durante "+ anos +" eh: "+ valorDaPrevisao);
    }
}