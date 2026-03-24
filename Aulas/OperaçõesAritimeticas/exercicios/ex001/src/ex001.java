import javax.swing.JOptionPane;
public class ex001 {
    public static void main(String[] args) throws Exception {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da 1º compra", "Compras", JOptionPane.QUESTION_MESSAGE)); 
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da 2º compra", "Compras", JOptionPane.QUESTION_MESSAGE)); 
        double soma = n1 + n2;
        JOptionPane.showMessageDialog(null, "Valor da compra: R$" + soma);
    }
}
