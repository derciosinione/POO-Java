package Bank;
import javax.lang.model.type.NullType;
import java.util.UUID;

public class Conta implements IConta {

    private String id;
    private double saldo;
    private String iban;
    private String numeroConta;

    public Pessoa titular;

    public Conta(Pessoa titular) {
        this.id = UUID.randomUUID().toString();
        this.saldo = 0;
        this.titular = titular;
        setNumeroConta();
    }

    public String getId() {
        return id;
    }

    private void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    private void reduzirSaldo(double montante) {
        this.saldo -= montante;
    }

    public String getIban() {
        return this.iban = "PT50" + this.numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    private void setNumeroConta() {
        this.numeroConta = UUID.randomUUID().toString();
    }

    @Override
    public String depositar(double montante) {
        if (montante <= 0)
            return "Nao eh possivel depositar valores negativos.";

        setSaldo(montante);

        return "";
    }

    @Override
    public String levantar(double montante) {

        if (montante <= 0)
            return "Nao eh possivel levantar um valores inferior a 0.";

        return "";
    }

    @Override
    public String transferir(String contaDestino, double montante) {
        /* TODO:    - Selecionar a conta de destino
                    - Enviar o montante desejado
                    - Atualizar o valor da conta de destino de acordo ao valor enviado
        */

        if (this.saldo < montante)
            return "O saldo nao eh suficiente para efetuar a operacao";

        // Selecionar a conta de destino

        // Enviar o montante desejado

        // Atualizar o valor da conta de destino de acordo ao valor enviado

        reduzirSaldo(montante);

        return "";
    }


    @Override
    public double verSaldo() {
        return 0;
    }

    @Override
    public String verIban() {
        return getIban();
    }
}


