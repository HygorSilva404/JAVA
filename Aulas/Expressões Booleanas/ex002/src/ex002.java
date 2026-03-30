import javax.swing.JOptionPane;

public class ex002 {
    public static void main(String[] args) throws Exception {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1º valor: ", "Verificador de valores", JOptionPane.QUESTION_MESSAGE));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1º valor: ", "Verificador de valores", JOptionPane.QUESTION_MESSAGE));

        boolean primeiroMaior = num1 > num2;

        JOptionPane.showMessageDialog(null, "O primeiro valor é maior que o segundo? " + primeiroMaior);
    }
}
