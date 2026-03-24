import java.util.Random;
import javax.swing.JOptionPane;
public class ex028 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int dado = random.nextInt(1,6);
        int forca = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua força?", "RPG TEST", JOptionPane.QUESTION_MESSAGE));
        int soma = forca + dado;
        System.out.format("Você tirou %d no dado", dado);
        System.out.format("Dano causado: %d", soma); 
    }
}