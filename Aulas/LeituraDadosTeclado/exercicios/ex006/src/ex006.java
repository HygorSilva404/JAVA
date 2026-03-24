import java.util.Scanner;
public class ex006 {
    public static void main(String[] args) throws Exception {
        String nome;
        String classe;
        int nvl;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome do personagem: ");
        nome = leitor.nextLine();

        System.out.println("Classe: ");
        classe = leitor.nextLine();

        System.out.println("Nvl Personagem: ");
        nvl = Integer.parseInt(leitor.nextLine());

        System.out.format("%s, da classe %s, alcancou o nivel %d", nome, classe, nvl);
    }
}
