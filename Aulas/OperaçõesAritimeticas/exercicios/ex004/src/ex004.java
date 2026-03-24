import javax.swing.JOptionPane;

public class ex004 {
    public static void main(String[] args) throws Exception {
        int userMetros = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor em METROS:", "Conversão", JOptionPane.QUESTION_MESSAGE));
        int cv = userMetros * 100;
        JOptionPane.showMessageDialog(null, "O valor pedido em cm tem: "  + cv);
    }
}
