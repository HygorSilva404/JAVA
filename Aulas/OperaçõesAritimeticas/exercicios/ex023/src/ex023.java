import java.util.Random;
public class ex023 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int valor1 = random.nextInt(1, 1001);
        int valor2 = random.nextInt(1, 1001);
        int dif = Math.abs(valor1 - valor2);
        System.out.format("o 1º foi %d e o 2º foi %d a diferença é %d", valor1, valor2, dif);
    }
}
