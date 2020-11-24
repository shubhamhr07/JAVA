package mobileApp;
import java.util.*;

public class Mobile {
    private final String myNumber;
     ArrayList<Contact> myContact;

    public Mobile(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        this.myContact.set(position, newContact);
        System.out.println(oldContact.getName() + " is updated to" + newContact.getName());
        return true;
    }
    public boolean removeContact(Contact contact){
        if(findContact(contact)<0){
            System.out.println("Contact not found");
            return false;
        }
        myContact.remove(findContact(contact));
        System.out.println(contact.getName()+"was Deleted");
        return true;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact Already Exist");
            return false;
        } else {
            myContact.add(contact);
            return true;
        }
    }

    private int findContact(Contact contact) {
        return this.myContact.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContact.size(); i++) {
            Contact contact = this.myContact.get(i);
            if (contact.getName().equals(contactName))
                return i;
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0)
            return contact.getName();
        return null;
    }
    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContact.get(position);
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List\n" +
                "My Number: "+myNumber);
        for (int i = 0; i < myContact.size(); i++){
            System.out.println((i+1)+" "+this.myContact.get(i).getName()+
                    " ---> "+this.myContact.get(i).getNumber());
        }
    }
}
