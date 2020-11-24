package mobileApp;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Mobile mobile = new Mobile("9813801405");
    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("Enter Action: (press 6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting Down...");
                    quit = true;
                    break;
                case 1:
                    mobile.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
            }
        }
    }
    private static void addNewContact(){
        System.out.println("Enter New Contact Name");
        String name = scanner.nextLine();
        System.out.println("Enter New Phone Number");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if(mobile.addNewContact(newContact)){
            System.out.println("New contact Added name: " +
                    name+", Phone: "+phone);
        }else{
            System.out.println("Cannot add "+name+" Already Exist");
        }
    }
    private static void updateContact(){
        System.out.println("Enter Existing Contact\n");
        String name = scanner.nextLine();
        Contact existingContact = mobile.queryContact(name);
        if(existingContact==null){
            System.out.println("Contact not Found");
            return;
        }
        System.out.println("Enter New Name");
        String newName = scanner.nextLine();
        System.out.println("Enter new Mobile Number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
        if(mobile.updateContact(existingContact,newContact)){
            System.out.println("Contact Updated.");
        }else{
            System.out.println("Unable to update.");
        }
    }
    private static void removeContact(){
        System.out.println("Enter Contact name:");
        String name = scanner.nextLine();
        Contact existingContact = mobile.queryContact(name);
        if(existingContact==null){
            System.out.println("Contact cannot found");
            return;
        }
        if(mobile.removeContact(existingContact)){
            System.out.println("Contact Deleted");
        }else{
            System.out.println("Error Deleting");
        }
    }
    private static void queryContact(){
        System.out.println("Enter Contact name:");
        String name = scanner.nextLine();
        Contact existingContact = mobile.queryContact(name);
        if(existingContact==null){
            System.out.println("Contact cannot found");
            return;
        }
        System.out.println("Name: "+existingContact.getName()+
                "Phone number is "+existingContact.getNumber());
    }

    private static void startPhone(){
        System.out.println("Starting Phone........");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions: \npress\n" +
                "0. Switch Off\n" +
                "1. Print Contacts\n" +
                "2. Add a new Contact\n" +
                "3. Update existing Contact\n" +
                "4. Remove Contact\n" +
                "5. query if an existing contact exist\n" +
                "6. Available options\n");
    }
}
