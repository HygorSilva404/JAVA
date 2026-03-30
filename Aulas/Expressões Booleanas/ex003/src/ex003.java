import javax.swing.JOptionPane;

public class ex003 {
    public static void main(String[] args) throws Exception {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor:", "varificador de valores", JOptionPane.QUESTION_MESSAGE));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor:", "varificador de valores", JOptionPane.QUESTION_MESSAGE));
        boolean verificador = valor1 == valor2;
        JOptionPane.showMessageDialog(null, "Os valores são iguais? " + verificador);
    }
}
