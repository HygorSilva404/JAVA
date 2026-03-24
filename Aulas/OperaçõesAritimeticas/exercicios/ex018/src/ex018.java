import javax.swing.JOptionPane;

public class ex018 {
    public static void main(String[] args) throws Exception {
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", "MENOR VALOR", JOptionPane.QUESTION_MESSAGE));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", "MENOR VALOR", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, Math.min(nota1, nota2));
    }
}
