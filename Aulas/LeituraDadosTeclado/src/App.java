import java.util.Scanner;
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        /* 
        int numero;
        System.out.println("Digite um numero: ");
        Scanner leitor = new Scanner(System.in);
        numero = leitor.nextInt();
        System.out.println("Numero é: " + numero);
        */
        /* 
        String jogo = "";
        String elo;
        int tier; // Integer.parseInt(string) -> transforma de string para int
        //float -> Float -> Float.parseFloat()
        //double -> Double -> Double.parseDouble()
        String valor;
        //Crio um objeto leitor para ler os valores digitados no teclado
        Scanner leitor = new Scanner(System.in);
        //Configurando para ler todas os espaços
        leitor.useDelimiter("[\r\n]");

        System.out.println("Qual o seu elo?");
        elo = leitor.nextLine();
    
        System.out.println("Qual o seu tier?");
        tier = Integer.parseInt(leitor.nextLine()); // numeros passe para o int

        System.out.println("Qual o seu campeao preferido?");
        String campeao = leitor.nextLine();

        System.out.format("Voce joga: %s é mono %s no elo %s %d",jogo, campeao, elo, tier);
    */
        String filme = JOptionPane.showInputDialog(null, "Qual o seu filme favorito?", "title", JOptionPane.QUESTION_MESSAGE);
    }
}