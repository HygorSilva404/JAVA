import java.util.Random;

public class ex024 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int dado1 = random.nextInt(1,7);
        int dado2 = random.nextInt(1,7);
        int dado3 = random.nextInt(1,7);
        int forca = dado1 + dado2 + dado3;
        System.out.println(forca);
        dado1 = random.nextInt(1,7);
        dado2 = random.nextInt(1,7);
        dado3 = random.nextInt(1,7);
        int pM = dado1 + dado2 + dado3;
        System.out.println(pM);
    }
}
