import javax.swing.JOptionPane;
public class ex014 {
    public static void main(String[] args) throws Exception {
        int numINT = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "Valor quadrado", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, Math.sqrt(numINT));
    }
}
