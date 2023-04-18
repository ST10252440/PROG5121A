import javax.swing.JOptionPane;

public class Marks {
    public static void main(String[] args) throws Exception {
        //DECLARATIONS
        int aMark = 80;
        int bMark = 70;
        int cMark = 60;
        int dMark = 50;
        int userMark;

        userMark = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your mark"));
        
        if(userMark < dMark) {
            JOptionPane.showMessageDialog(null, "E");
        }
        else if(userMark >= dMark && userMark < cMark ) {
            JOptionPane.showMessageDialog(null, "D");
        }
        else if(userMark >= cMark && userMark < bMark) {
            JOptionPane.showMessageDialog(null, "C");
        }
        else if(userMark >= bMark && userMark < aMark) {
            JOptionPane.showMessageDialog(null, "B");
        }
        else {
            JOptionPane.showMessageDialog(null, "A");
        }
    }
}
