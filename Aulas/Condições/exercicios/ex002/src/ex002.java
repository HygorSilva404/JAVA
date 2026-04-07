import javax.swing.JOptionPane;
public class ex002 {
    public static void main(String[] args) throws Exception {
        int userValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês", "Mês do Ano", JOptionPane.QUESTION_MESSAGE));
        if (userValue == 1) {
            JOptionPane.showMessageDialog(null, "É Janeiro");
        }
        else if (userValue == 2) {
            JOptionPane.showMessageDialog(null, "É Fevereiro");
        }
        else if (userValue == 3) {
            JOptionPane.showMessageDialog(null, "É Março");
        }
        else if (userValue == 4) {
            JOptionPane.showMessageDialog(null, "É Abril");
        }
        else if (userValue == 5) {
            JOptionPane.showMessageDialog(null, "É Maio");
        }
        else if (userValue == 6) {
            JOptionPane.showMessageDialog(null, "É Junho");
        }
        else if (userValue == 7) {
            JOptionPane.showMessageDialog(null, "É Julho");
        }
        else if (userValue == 8) {
            JOptionPane.showMessageDialog(null, "É Agosto");
        }
        else if (userValue == 9) {
            JOptionPane.showMessageDialog(null, "É Setembro");
        }
        else if (userValue == 10) {
            JOptionPane.showMessageDialog(null, "É Outubro");
        }
        else if (userValue == 11) {
            JOptionPane.showMessageDialog(null, "É Novembro");
        }
        else if (userValue == 12) {
            JOptionPane.showMessageDialog(null, "É Dezembro");
        }
        else{
            JOptionPane.showMessageDialog(null, "INFORME UM VALOR VALIDO");
        }
    }
}
