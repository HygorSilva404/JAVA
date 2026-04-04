import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Você estudou hoje?");
        boolean respEstudo = leitor.nextBoolean();
        System.out.println("Você praticou exercícios de Java hoje?");
        boolean respJava = leitor.nextBoolean();
        boolean respTrue = respEstudo && respJava == true;
        System.out.println(respTrue);
    }
}
