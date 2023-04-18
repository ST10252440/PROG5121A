import javax.swing.JOptionPane;

public class Commission {
    public static void main(String[] args) throws Exception {
        int userSales;
        double commission;
        
        userSales = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your sales"));
        if(userSales <= 500) {
            commission = (userSales * 0.02);
        }
        else if(userSales > 500 && userSales <= 5000) {
            commission = (userSales * 0.05); 
        }
        else{ 
            commission = (userSales * 0.08);
        }
        JOptionPane.showMessageDialog(null, "Your sales: " + userSales + "\n Your commission earned: R" + commission);
    }
}
