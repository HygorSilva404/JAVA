import javax.swing.JOptionPane;

public class ex014 {
    public static void main(String[] args) throws Exception {
        String classe = JOptionPane.showInputDialog(null, "Classe do jogador:", "Montagem de ficha", JOptionPane.QUESTION_MESSAGE);
        String regiao = JOptionPane.showInputDialog(null, "Região do jogador:", "Montagem de ficha", JOptionPane.QUESTION_MESSAGE);
        String arma = JOptionPane.showInputDialog(null, "Arma do jogador:", "Montagem de ficha", JOptionPane.QUESTION_MESSAGE);
        int nvl = Integer.parseInt(JOptionPane.showInputDialog(null, "Nível do jogador:", "Montagem de ficha", JOptionPane.QUESTION_MESSAGE));
        boolean verificaNVL = nvl == 99;

        String msg = String.format("Classe: %s\nRegião: %s\nArma: %s\nNível: %d\nNiível máximo alcaçado: %b", classe, regiao, arma, nvl, verificaNVL);

        JOptionPane.showMessageDialog(null, msg);
    }
}
