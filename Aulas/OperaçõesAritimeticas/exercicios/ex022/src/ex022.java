import java.util.Random;

public class ex022 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int dado = random.nextInt(1,7);
        System.out.println(dado);
    }
}
