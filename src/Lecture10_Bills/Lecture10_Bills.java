package Lecture10_Bills;
import javax.swing.*;

public class Lecture10_Bills {
    public static void main(String[] args) throws Exception {
        String strName = JOptionPane.showInputDialog(null, "Enter your customer's name");
        double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter number of minutes talked"));
        double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost per minute"));

        //SENDS VARIABLES TO CONSTRUCTOR
        Bills gumede = new Bills(strName, dblMinutesTalked, dblCostPerMinute);

        JOptionPane.showMessageDialog(null, "Customer Name: " + gumede.getName().toUpperCase() + "\n Total Due: R " + gumede.getTotalBills());
    }
}
