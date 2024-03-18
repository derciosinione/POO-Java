package Bank;

public interface IConta {
    String depositar(double montante);
    String levantar(double montante);
    String transferir(String contaDestino, double montante);
    double verSaldo();
    String verIban();
}
