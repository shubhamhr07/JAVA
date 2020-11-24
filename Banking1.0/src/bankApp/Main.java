package bankApp;


public class Main {
    public static void main(String[] args) {
	    Bank bank = new Bank("STATE BANK OF INDIA");
	    bank.addBranch("Haryana");
	    bank.addCustomer("Shubham","Haryana",500);
	    bank.addCustomer("Nisha","Haryana",600);
	    bank.addCustomer("Aryan","Haryana",550);

        bank.addBranch("Punjab");
        bank.addCustomer("Nikhil","Punjab",460);
        bank.addCustomer("Yajat","Punjab",560);
        bank.addCustomer("Attri","Punjab",440);

        bank.addCustomerTransaction("Shubham","Haryana",5700);
        bank.addCustomerTransaction("Shubham","Haryana",5560);
        bank.addCustomerTransaction("Shubham","Haryana",4500);

        bank.listCustomers("Haryana",true);
        bank.listCustomers("Punjab",true);
    }
}
