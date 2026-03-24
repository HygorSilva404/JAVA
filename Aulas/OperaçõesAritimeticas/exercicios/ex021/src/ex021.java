import java.util.Random;
public class ex021 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int valor = random.nextInt(2);
        valor *= 10;
        System.out.println(valor);
    }
}
