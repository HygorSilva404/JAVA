import javax.swing.JOptionPane;

public class ex015 {
    public static void main(String[] args) throws Exception {
        int raiz = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero:", "QUADRADO DO NUMERO", JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null, Math.pow(raiz, 2));
    }
}
