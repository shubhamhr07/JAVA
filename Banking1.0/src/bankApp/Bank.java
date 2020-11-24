package bankApp;

import java.util.ArrayList;

public class Bank {
    private  String name;
    ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String customerName,String branchName,double initialAmount){
        Branch existingBranch = findBranch(branchName);
        if (existingBranch!=null){
            existingBranch.newCustomer(customerName,initialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String customerName,String branchName,double amount){
        Branch existingBranch = findBranch(branchName);
        if (existingBranch!=null) {
            return existingBranch.newCustomerTransaction(customerName,amount);
        }
        return false;
    }
    private Branch findBranch(String branchName){
        for(int i=0;i<branches.size();i++){
            Branch checkedBranch = branches.get(i);
            if(checkedBranch.getName()==branchName){
                return checkedBranch;
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName,boolean showTransaction){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("\nCustomer Details for branch: "+branch.getName());
            ArrayList<Customer> branchCustomer = branch.getCustomer();
            for(int i=0;i<branchCustomer.size();i++){
                Customer customer = branchCustomer.get(i);
                System.out.println("Customer: "+customer.getName()+" ["+(i+1)+"]");
                if(showTransaction){
                    System.out.println("Transactions:");
                    ArrayList<Double> transaction = customer.getTransaction();
                    for(int j=0;j<transaction.size();j++) {
                        System.out.println("[" + j + "]  Amount: " + transaction.get(j));
                    }
                }
            }
            return true;
        }else{
                return false;
            }
    }
}



