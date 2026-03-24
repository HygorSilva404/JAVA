import javax.swing.JOptionPane;
public class ex010 {
    public static void main(String[] args) throws Exception {
        double horasDia1 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Qunatas horas estudadas no 1º dia?", "Horas estudadas", JOptionPane.QUESTION_MESSAGE)
        );
        double horasDia2 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Qunatas horas estudadas no 2º dia?", "Horas estudadas", JOptionPane.QUESTION_MESSAGE)
        );
        double horasDia3 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Qunatas horas estudadas no 3º dia?", "Horas estudadas", JOptionPane.QUESTION_MESSAGE)
        );

        double horasMedia = (horasDia1 + horasDia2 +  horasDia3) / 3;

        JOptionPane.showMessageDialog(null, "A média das suas horas estudadas foi de: "+ horasMedia);
    }
}
