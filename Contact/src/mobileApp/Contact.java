package mobileApp;


public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public static Contact createContact(String newName, String newNumber){
        return new Contact(newName,newNumber);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
