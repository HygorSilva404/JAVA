import java.util.Scanner;
public class ex005 {
    public static void main(String[] args) throws Exception {
        int soma;
        String primeiroValor;
        String segundoValor;

        Scanner leitor = new Scanner(System.in);

        System.out.println("primeiro valor: ");
        primeiroValor = leitor.nextLine();

        System.out.println("Segundo valor: ");
        segundoValor = leitor.nextLine();

        soma = Integer.parseInt(primeiroValor) + Integer.parseInt(segundoValor);

        System.out.println("A soma dos numeros e: " + soma);
    }
}
