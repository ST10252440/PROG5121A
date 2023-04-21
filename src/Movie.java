import javax.swing.JOptionPane;

public class Movie {
    static String movieName;
    static String movieCode;
    public static void main(String[] args) throws Exception {
        do{
            movieName = JOptionPane.showInputDialog(null, "Please enter a movie name (less than 20 characters)");
            if(movieName.length() <= 20) {
                Boolean bool = false;
                JOptionPane.showMessageDialog(null, "Thank you. movie inputted.");
                while(bool == false) {
                    movieCode = JOptionPane.showInputDialog(null, "Please enter movie code");
                    bool = check_password_complexity(movieCode);
                }
                JOptionPane.showMessageDialog(null, "Movie code valid.");
                return;
            }
            else {
                JOptionPane.showMessageDialog(null, "Must be less than 20 characters.");
            }

        }
        while(true);
    }

    public static boolean check_password_complexity(String movCode) {
        if(movCode.length() >= 8) {
            boolean check1 = false;
            boolean check2 = false;
            char chr;
            chr = movCode.charAt(0);
            if(Character.isUpperCase(chr)) {
                check1 = true;
            }
            for(int character = 0; character < movCode.length(); character+=1) {
                chr = movCode.charAt(character);
                if(Character.isDigit(chr)) {
                    check2 = true;
                }
            if(check1 && check2) {
                return true;
            }
        } 
    }
    JOptionPane.showMessageDialog(null,"Invalid movie code.");
    return false;
    }
}
