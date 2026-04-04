import java.util.Scanner;
public class ex008 {
    public static void main(String[] args) throws Exception {
        Scanner leitor  = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int valor = leitor.nextInt();
        boolean par = valor % 2 == 0;
        System.out.println("O valor digitado é par: " + par); 
    }
}