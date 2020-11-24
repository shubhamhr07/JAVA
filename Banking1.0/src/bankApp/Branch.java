package bankApp;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customer;

    public Branch(String name) {
        this.name = name;
        this.customer = new ArrayList<Customer>();

    }
    public boolean newCustomer(String name,double amount){
        if(findCustomer(name)==null){
            this.customer.add(new Customer(name,amount));
            return true;
        }
        return false;
    }
    public boolean newCustomerTransaction(String name,double amount){
        Customer existingCustomer = findCustomer(name);
        if(existingCustomer!=null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String name){
         for(int i = 0; i<this.customer.size(); i++){
             Customer checkedCustomer = this.customer.get(i);
             if(checkedCustomer.getName()==name){
                 return checkedCustomer;
             }
         }
         return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }
}
