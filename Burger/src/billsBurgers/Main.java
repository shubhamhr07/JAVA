package billsBurgers;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger burger = new Hamburger("garlic","fried");
        burger.addOns();
        System.out.println("Additions: "+burger.getAdditions());

    }
}
