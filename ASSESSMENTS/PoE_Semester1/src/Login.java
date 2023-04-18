import java.util.*;
import javax.swing.*;

public class Login {

    List<String> loginDetails = new ArrayList<String>();
    List<String> userDetails = new ArrayList<String>();

    public String capture_details(String type) {
        String value = "";
        boolean isValid = false;
        while(isValid == false) {
            switch(type){
                case "username":
                value = JOptionPane.showInputDialog(null, "Please enter your username");
                isValid = check_username(value);
                break;
                case "password":
                value = JOptionPane.showInputDialog(null, "Please enter your password");
                isValid = check_password_complexity(value);
                break;
            }
            System.out.println(type);
            JOptionPane.showMessageDialog(null, register_user(isValid, type));
        }
        loginDetails.add(value);
        System.out.println(value);
        return(value);
    }
    
    public boolean check_username(String username) {
        if(username.contains("_") && (username.length() <= 5)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean check_password_complexity(String username) {
        if(username.length() >= 8) {
            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;
            char chr;
            for(int character = 0; character < username.length(); character+=1) {
                chr = username.charAt(character);
                if(Character.isDigit(chr)) {
                    check1 = true;
                }
                else if(Character.isUpperCase(chr)) {
                    check2 = true;
                }
                else if(!Character.isWhitespace(chr) && (!Character.isLetterOrDigit(chr))) {
                    check3 = true;
                }
            if(check1 && check2 && check3) {
                return true;
            }
        } 
    }
    return false;
    }
    
    public boolean login_user() {
        String usernameEntered;
        String passEntered;
        int keyIndex = -1;
        boolean valid = false;
        usernameEntered = JOptionPane.showInputDialog(null, "Please enter username");
        passEntered =  JOptionPane.showInputDialog(null, "Please enter password");
        for(int i = 0; i < loginDetails.size()-1; i++) {
            if(loginDetails.get(i).equals(usernameEntered) && loginDetails.get(i+1).equals(passEntered)) {
                keyIndex = i;
                System.out.println("Success");
            } 
            System.out.println(loginDetails.get(i) + usernameEntered);
            System.out.println(loginDetails.get(i+1) + passEntered);
        }
        if(keyIndex < 0) {
            valid = false;
        }
        else {
            valid = true;
        }
        JOptionPane.showMessageDialog(null, return_login_status(valid, keyIndex));
        return valid;

    }

    public String register_user(boolean valid, String type) {
        switch(type) {
            case("username"): 
            if(valid == (false)) {
                return """ 
                    Error! Please make sure your username is 
                    less than 6 characters in length and includes an underscore (_), e.g. Ga_kar""";
            }
            else {
                return "Your username has been updated successfully";
            }
            case("password"):
            if(valid == (false)) {
                return """ 
                    Error! Please make sure your password is 
                    more than 8 characters in length and includes a number and special
                    character, e.g. Kimayoko118!!!""";
            }
            else {
                return "Your password has been updated successfully";
            }
            case("username&password"):
            return "Your registration was completed successfully.";
        }
        return "Error";
    }

    public String return_login_status(boolean valid, int index) {
        if(valid == false) {
            return "Error! password incorrect";
        }
        return "Welcome user " + userDetails.get(index) + " " + userDetails.get(index+1);
    }
}
