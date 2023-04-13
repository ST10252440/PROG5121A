package Login;
import java.lang.reflect.Array;
import java.util.*;
import javax.swing.*;

public class Login {

    List<String> loginDetails = new ArrayList<String>();
    List<String> userDetails = new ArrayList<String>();

    public String capture_details(String type) {
        String value = "";
        boolean isValid = false;
        boolean check1 = false;
        boolean check2 = false;
        boolean check3 = false;
        char chr;
        while(isValid == false) {
            switch(type){
                case "username":
                    value = JOptionPane.showInputDialog(null, "Please enter your username");
                    if(value.contains("_") && (value.length() <= 5)) {
                        isValid = true;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, """ 
                        Error! Please make sure your username is 
                        less than 6 characters in length and includes an underscore (_), e.g. Ga_kar""");
                        isValid = false;
                    }
                    break;
                case "password":
                value = JOptionPane.showInputDialog(null, "Please enter your password");
                if(value.length() >= 8) {
                    check1 = false;
                    check2 = false;
                    check3 = false;
                    for(int character = 0; character < value.length(); character+=1) {
                        chr = value.charAt(character);
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
                        isValid = true;
                    }
                    else {
                        isValid = false;

                    }
                } 
                }
                else { 
                    isValid = false;
                }
                if(isValid == false) {
                    JOptionPane.showMessageDialog(null, """ 
                        Error! Please make sure your password is 
                        more than 8 characters in length and includes a number and special
                        character, e.g. Kimayoko118!!!""");
                }
                break;
        }
        }
        JOptionPane.showMessageDialog(null, "Your " + type + " has been updated successfully: " + value);
        loginDetails.add(value);
        System.out.println(value);
        return(value);
    }

    public void login_process() {
        String usernameEntered;
        String passEntered;
        int keyIndex = -1;

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
            JOptionPane.showMessageDialog(null, "Error! password incorrect");
        }
        else {
            JOptionPane.showMessageDialog(null, "Welcome user " + userDetails.get(keyIndex) + " " + userDetails.get(keyIndex+1));
        }
    }
}

