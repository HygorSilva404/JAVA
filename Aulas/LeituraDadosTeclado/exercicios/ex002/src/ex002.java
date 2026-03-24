import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) throws Exception {
        float notaProva;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor da nota:");
        notaProva = Float.parseFloat(leitor.nextLine());
        System.out.println("A nota da prova foi: " + notaProva);
    }
}
