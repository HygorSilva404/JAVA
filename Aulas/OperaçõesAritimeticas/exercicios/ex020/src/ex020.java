import java.util.Random;
import javax.swing.JOptionPane;
public class ex020 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int valor = random.nextInt(2);
        JOptionPane.showMessageDialog(null, valor);
    }
}
