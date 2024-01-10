package Encapsulamento;

public class Orcamento {
    private double ValorSemanal;
    private double ValorMensal;
    private double ValorAnual;

    public double getValorSemanal() {
        return ValorSemanal;
    }

    public void setValorSemanal(double valorSemanal) {
        ValorSemanal = valorSemanal;
        ValorMensal = valorSemanal * 4;
        calcularValorAnual();
    }

    public double getValorMensal() {
        return ValorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.ValorMensal = valorMensal;
        ValorSemanal = valorMensal / 4;
        calcularValorAnual();
    }

    private void calcularValorAnual() {
        ValorAnual = ValorMensal * 12;
    }

    public double getValorAnual() {
        calcularValorAnual();
        return ValorAnual;
    }

    public double valorDaPrevisaoAnual(int anos) {
        return getValorAnual() * anos;
    }

    @Override
    public String toString() {
        return "{" +
                "ValorSemanal:" + ValorSemanal +
                ", ValorMensal:" + ValorMensal +
                ", ValorAnual:" + ValorAnual +
                '}';
    }
}
