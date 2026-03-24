import javax.swing.JOptionPane;
public class ex007 {
    public static void main(String[] args) throws Exception {
        String filmeVisto = JOptionPane.showInputDialog(null, "Qual o melhor filme do Ghibli que você viu?", "Questionario", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, filmeVisto);
    }
}
