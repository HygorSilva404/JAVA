import java.util.Scanner;
public class ex010 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome =  leitor.nextLine();
        System.out.println("Digite sua idade:");
        int idade = leitor.nextInt();
        boolean personagem = nome == "Ash" || idade == 12;
        System.out.println(personagem);
    }
}