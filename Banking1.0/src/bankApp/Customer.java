package bankApp;

import java.util.ArrayList;

public class Customer {
    private String name;
    private boolean balance;
    ArrayList<Boolean> transcation = new ArrayList<Boolean>();

    public Customer(String name, ArrayList<Boolean> transcation) {
        this.name = name;
        this.transcation = transcation;
    }


    public void createCoustomer(String name,boolean amount){
        return new Customer(name,amount);

    }
    public boolean newTranscation(boolean amount){
        return transcation[transcation.length()];
    }

    public String getName() {
        return name;
    }

    public boolean isBalance() {
        return balance;
    }

    public ArrayList<Boolean> getTranscation() {
        return transcation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(boolean balance) {
        this.balance = balance;
    }

    public void setTranscation(ArrayList<Boolean> transcation) {
        this.transcation = transcation;
    }
}
