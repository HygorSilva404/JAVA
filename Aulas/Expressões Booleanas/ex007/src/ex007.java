import javax.swing.JOptionPane;
public class ex007 {
    public static void main(String[] args) throws Exception {
        String loginUser = "admin";
        String user =  JOptionPane.showInputDialog(null, "User:", "Login", JOptionPane.QUESTION_MESSAGE);
        boolean loginRealizado = !user.equals(loginUser);
        System.out.println(loginRealizado);
    }
}