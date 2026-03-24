import javax.swing.JOptionPane;
public class ex008 {
    public static void main(String[] args) throws Exception {
        String nomeRobo = JOptionPane.showInputDialog(null, "Qual seria o nome perfeito para um robo?", "Programação", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O robo " + nomeRobo + " está pronto para codar 24h por dia");
    }
}
