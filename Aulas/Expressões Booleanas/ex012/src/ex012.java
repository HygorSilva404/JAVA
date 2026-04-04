import java.util.Scanner;
public class ex012 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos magas voce já leu?");
        int mangas = leitor.nextInt();
        System.out.println("Quantos animes voce já assistiu?");
        int anime = leitor.nextInt();
        int tot = mangas + anime;
        boolean maior50 = tot >= 50;
        System.out.println("Você viu mais de 50 obras? " + maior50);
    }
}