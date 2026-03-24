import java.util.Scanner;
public class ex009 {
    public static void main(String[] args) throws Exception {
        String objeto;
        String animal;
        int num;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o seu objeto?");
        objeto = leitor.nextLine();

        System.out.println("Qual o seu animal?");
        animal = leitor.nextLine();

        System.out.println("Qual o seu numero?");
        num = Integer.parseInt(leitor.nextLine());

        System.out.format("O espadachim do %s %s nº %d esta pronto para a batalha!",objeto, animal, num);
    }
}
