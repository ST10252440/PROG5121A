import java.util.*;
import javax.swing.*;

public class Tasks {

    public boolean isRunning;
    List<String> taskArray = new ArrayList<String>(); 

    public void taskProcess() {
        isRunning = true;
        while(isRunning == true) {
            String selection = JOptionPane.showInputDialog(null, """
                    What would you like to do? Please input one of the following:
                    - (ADD_TASK)
                    - (SHOW_TASKS)
                    - (EXIT)
                    """);
            if(selection.equals("ADD_TASK")) {
                String task = JOptionPane.showInputDialog(null, "What task would you like to add?");
                taskArray.add(task);
            }
            if(selection.equals("SHOW_TASKS")) {
                String optionList = "";
                for(int i = 0; i < taskArray.size()-1; i++) {
                    optionList += (i+1 + " - " +  taskArray.get(i) + "\n");
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
