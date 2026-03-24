import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) throws Exception {
        int numUser;
        System.out.println("Digite  um numero: ");
        Scanner leitor = new Scanner(System.in);
        numUser = Integer.parseInt(leitor.nextLine());
        System.out.println("O numero digitado foi: " + numUser);
    }
}
