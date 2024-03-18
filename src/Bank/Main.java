package Bank;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String valor = UUID.randomUUID().toString();
        System.out.println("This is the random UID:" + valor);
    }
}
