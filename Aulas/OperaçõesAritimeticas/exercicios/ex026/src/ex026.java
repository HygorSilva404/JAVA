import java.util.Random;
public class ex026 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int d20 = random.nextInt(1, 21);
        System.out.format("Você tirou o número %d no D20", d20);
    }
}