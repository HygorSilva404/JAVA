import java.util.Random;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) throws Exception {
        Random aletorio = new Random();
        Scanner leitor = new Scanner(System.in);
        int valorComp = aletorio.nextInt(0, 6);
        String resp;
        if (valorComp % 2 == 0){
            resp = "Par";
        } else {
            resp = "Impar";
        }
        System.out.println("Digite par ou impar:");
        String respUser = leitor.nextLine();
        
    }
}