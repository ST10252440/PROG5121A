import javax.swing.JOptionPane;

public class ICE4 {
    public static void main(String[] args) throws Exception {
        
        //DECLARATIONS
        int ageFloor = 18;
        int ageCeil = 35;

        int userAge;
        String userGender;
        int userGuestCount;

        //PROCESS
        userAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age"));
        if(userAge < 18 || userAge > 35) {
            JOptionPane.showMessageDialog(null, "Sorry, you are not allowed to enter.", "Apologies", JOptionPane.WARNING_MESSAGE);
        }
        else{
            userGender = JOptionPane.showInputDialog(null, "What is your gender? F/M");
            userGuestCount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many people?"));
            if(userGender.equals("M")) {
                JOptionPane.showMessageDialog(null, "Your price is: $" + (userGuestCount * 10));
            }
            else {
                JOptionPane.showMessageDialog(null, "Your price is: $" + 0);
            }
        }
        
    }
}
