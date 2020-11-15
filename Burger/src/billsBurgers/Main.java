package billsBurgers;

public class Main {

    public static void main(String[] args) {
        Hamburger zinger = new Hamburger("White","smokey Grilled");
        zinger.getAddOn1("Egg",20);
        zinger.getAddOn2("Onion",10);
        zinger.getAddOn3("Olives",40);
        System.out.println("Total: "+zinger.addOns());
        System.out.println("-----------------------------------------------------");
        HealthyBurger burger = new HealthyBurger();
        burger.getAddOn1("Tomato",20);
        burger.getAddOn2("Lettuce",30);
        System.out.println("Total: "+burger.addOns());
        System.out.println("_____________________________________________________");
        Deluxe mac = new Deluxe("Garlic","Fried");
        System.out.println(mac.addOns());

    }
}
