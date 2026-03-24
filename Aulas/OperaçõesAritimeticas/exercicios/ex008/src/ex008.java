import javax.swing.JOptionPane;

public class ex008 {
    public static void main(String[] args) throws Exception {
        int quantTemp = Integer.parseInt(JOptionPane.showInputDialog(null, "Total de temporadas:", "Tempo gasto", JOptionPane.QUESTION_MESSAGE));
        int quantEps = Integer.parseInt(JOptionPane.showInputDialog(null, "Total de episodios:", "Tempo gasto", JOptionPane.QUESTION_MESSAGE));
        int quantMinEps = Integer.parseInt(JOptionPane.showInputDialog(null, "Total de minutos por episodio:", "Tempo gasto", JOptionPane.QUESTION_MESSAGE));

        int tempo = (quantMinEps * quantEps) * quantTemp;

        JOptionPane.showMessageDialog(null, "O total de tempo para assitr essa série é: " + tempo + "minutos");
    }
}
