import javax.swing.JOptionPane;
public class ex007 {
    public static void main(String[] args) throws Exception {
        int muscKpop = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas musicas escutadas do gênero Kpop: ", "Musicas", JOptionPane.QUESTION_MESSAGE));
        int muscRock = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas musicas escutadas do gênero Rock: ", "Musicas", JOptionPane.QUESTION_MESSAGE));
        int muscMBP = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas musicas escutadas do gênero MPB: ", "Musicas", JOptionPane.QUESTION_MESSAGE));

        int soma = muscKpop + muscMBP + muscRock;

        JOptionPane.showMessageDialog(null, "Foram escutas no total: " + soma + " musicas");
    }
}
