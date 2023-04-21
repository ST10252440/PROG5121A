import java.util.*;
import javax.swing.*;

public class Tasks {

    public boolean isRunning;
    //List<String> taskArray = new ArrayList<String>(); 
    List<String> userArray = new ArrayList<String>(); 

    public void taskProcess() {
        int arrayLen = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks would you like to store?"));
        String taskArray[] = new String[arrayLen];
        String descArray[] = new String[arrayLen];
        int arraySelect = 0;
        isRunning = true;
        while(isRunning == true) {
            String selection = JOptionPane.showInputDialog(null, """
                    What would you like to do? Please input one of the following:
                    - (ADD_TASK)
                    - (SHOW_REPORT)
                    - (EXIT)
                    """);
            if(selection.equals("ADD_TASK")) {
                if(arraySelect == arrayLen) {
                    JOptionPane.showMessageDialog(null, "Sorry! No more than " + arrayLen + " tasks may be added.");
                }
                else{
                    String task = JOptionPane.showInputDialog(null, "What task would you like to add?");
                    taskArray[arraySelect] = task;
                    do {
                        task = JOptionPane.showInputDialog(null, "Please describe this task (Less than 50 characters)");
                        if(task.length() > 50) {
                            JOptionPane.showMessageDialog(null, "Error !! More than 50 Characters.");
                        }
                    }
                    while(task.length()>50);
                    descArray[arraySelect] = task;
                    arraySelect++;
                    JOptionPane.showMessageDialog(null, "Task added successfully.");
                }
            }
            if(selection.equals("SHOW_REPORT")) {
                //JOptionPane.showMessageDialog(null, "Coming soon !");
                 
                String optionList = "";
                for(int i = 0; i < arrayLen; i++) {
                    optionList += (i+1 + " - " +  taskArray[i] + "\n");
                    optionList += ("       : " + " " + descArray[i] + "\n");
                } 
                JOptionPane.showMessageDialog(null, "Your tasks: \n" + optionList);
                
            }
            if(selection.equals("EXIT")) {
                JOptionPane.showMessageDialog(null, "Have a nice day");
                isRunning = false;
                break;
            }
        }
    }
    
}
