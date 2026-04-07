import javax.swing.JOptionPane; 
public class ex001 {
    public static void main(String[] args) throws Exception {
        int userValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor", "Resposta de valore", JOptionPane.QUESTION_MESSAGE));
        if (userValue == 1) {
            JOptionPane.showMessageDialog(null, "É Domingo");
        }
        else if (userValue == 2) {
            JOptionPane.showMessageDialog(null, "É Segunda-Feira");
        }
        else if (userValue == 3) {
            JOptionPane.showMessageDialog(null, "É Terça-Feira");
        }
        else if (userValue == 4) {
            JOptionPane.showMessageDialog(null, "É Quarta-Feira");
        }
        else if (userValue == 5) {
            JOptionPane.showMessageDialog(null, "É Quinta-Feira");
        }
        else if (userValue == 6) {
            JOptionPane.showMessageDialog(null, "É Sexta-Feira");
        }
        else if (userValue == 7) {
            JOptionPane.showMessageDialog(null, "É Sábado");
        }
        else{
            JOptionPane.showMessageDialog(null, "INFORME UM VALOR VALIDO");
        }
    }
}