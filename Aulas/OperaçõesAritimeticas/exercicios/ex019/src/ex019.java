import javax.swing.JOptionPane;
public class ex019 {
    public static void main(String[] args) throws Exception {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "MAIOR NUMERO", JOptionPane.QUESTION_MESSAGE));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "MAIOR NUMERO", JOptionPane.QUESTION_MESSAGE));
        int valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "MAIOR NUMERO", JOptionPane.QUESTION_MESSAGE));
        int valor4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "MAIOR NUMERO", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, Math.max(Math.max(valor3, valor4), Math.max(valor1, valor2)));
    }
}
