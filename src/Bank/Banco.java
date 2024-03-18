package Bank;

import java.util.ArrayList;
import java.util.UUID;

public class Banco {
    private String id;
    private ArrayList<Conta> contas;
    private double taxa;
    private String nome;

    public Banco(double taxa, String nome) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.taxa = taxa;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public double getTaxa() {
        return taxa;
    }

    public String getNome() {
        return nome;
    }
}
