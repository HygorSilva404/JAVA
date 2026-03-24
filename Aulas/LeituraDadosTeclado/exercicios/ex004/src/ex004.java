import java.util.Scanner;
public class ex004 {
    public static void main(String[] args) throws Exception {
        String nome;
        String cidade;
        String comidaFavorita;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        nome = leitor.nextLine();

        System.out.println("Qual a sua cidadade?");
        cidade = leitor.nextLine();

        System.out.println("Qual a sua comida favorita?");
        comidaFavorita = leitor.nextLine();

        System.out.format("%s, de %s, provavelmente esta com vontade de comer %s agora", nome, cidade, comidaFavorita);
    }
}
