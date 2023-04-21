import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        String userName;
        String passWord;
        String firstName;
        String secondName;
        Login logSys = new Login();
        Tasks taskSys = new Tasks();

        taskSys.taskProcess();
        /*System.out.println("Hello, World!");
        userName = logSys.capture_details("username");
        passWord = logSys.capture_details("password");
        firstName = JOptionPane.showInputDialog(null, "first name");
        secondName = JOptionPane.showInputDialog(null, "second name");
        JOptionPane.showMessageDialog(null, logSys.register_user(true, "username&password"));
        JOptionPane.showMessageDialog(null, userName + " " + passWord + " " + firstName + " " + secondName);
        logSys.userDetails.add(firstName);
        logSys.userDetails.add(secondName);
        logSys.login_user();*/
    }
}