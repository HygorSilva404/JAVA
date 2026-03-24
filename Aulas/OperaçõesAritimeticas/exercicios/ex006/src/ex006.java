import javax.swing.JOptionPane;

public class ex006 {
    public static void main(String[] args) throws Exception {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1º valor:", "Pseudo-Tabuada", JOptionPane.QUESTION_MESSAGE));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "2º valor:", "Pseudo-Tabuada", JOptionPane.QUESTION_MESSAGE));
        int soma = n1 + n2;
        int sub = n1 - n2;
        int mult = n1 * n2;
    
        String res = String.format( "%d + %d = %d\n %d - %d = %d\n%d x %d = %d", n1, n2, soma, n1,n2, sub, n1, n2, mult);

        JOptionPane.showMessageDialog(null, res);
    }
}
