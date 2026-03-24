import java.util.Random;
import javax.swing.JOptionPane;
public class ex027 {
    public static void main(String[] args) throws Exception {
       Random random = new Random();
        int entrada0 = Integer.parseInt(JOptionPane.showInputDialog(null, "o primeiro valor:", "Gerador de valores entre valores", JOptionPane.QUESTION_MESSAGE));
        int entrada1 = Integer.parseInt(JOptionPane.showInputDialog(null, "o primeiro valor:", "Gerador de valores entre valores", JOptionPane.QUESTION_MESSAGE));
        int valorSort = random.nextInt(entrada0, entrada1 + 1);
        System.out.format("Os valores de entrada foi %d e %d e o valor sorteado entre eles é %d", entrada0, entrada1, valorSort);
    }
}