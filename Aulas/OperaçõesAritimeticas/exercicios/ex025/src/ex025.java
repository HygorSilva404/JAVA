import java.util.Random;
public class ex025 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int valor = random.nextInt(0, 99);
        System.out.format("Parabéns! Você ganhou um vale-coffee número %d", valor);
    }
}