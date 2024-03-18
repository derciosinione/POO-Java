package Bank;

import java.util.UUID;

public class Pessoa {
    public String id;
    public String Nome;
    public String dataNascimeto;
    public String nif;

    public Pessoa(String nome, String nif, String dataNascimeto) {
        this.id = UUID.randomUUID().toString();
        Nome = nome;
        this.dataNascimeto = dataNascimeto;
        this.nif = nif;
    }

}
