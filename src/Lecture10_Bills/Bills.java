package Lecture10_Bills;

public class Bills {

private String strCustomer;
private double dblMinutes, dblCost;


    public Bills(String strName, double dblCostPerMinute, double dblMinutesTalked) {
        strCustomer = strName;
        dblMinutes = dblMinutesTalked;
        dblCost = dblCostPerMinute;
    }

    public String getName() {
        return strCustomer;
    }

    public double getTotalBills() {
        return (dblMinutes * dblCost);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
