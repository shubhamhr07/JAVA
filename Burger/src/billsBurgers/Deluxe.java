package billsBurgers;

public class Deluxe extends Hamburger{
    public Deluxe(String bread, String meat) {
        super(bread, meat);
        super.getAddOn1("olives",50);
        super.getAddOn2("Carrot",20);
    }


    @Override
    public void getAddOn1(String name, int price) {
        System.out.println("Cannot add additional item in Deluxe Burger");
    }

    @Override
    public void getAddOn2(String name, int price) {
        System.out.println("Cannot add additional item in Deluxe Burger");
    }

    @Override
    public void getAddOn3(String name, int price) {
        System.out.println("Cannot add additional item in Deluxe Burger");
    }

    @Override
    public void getAddOn4(String name, int price) {
        System.out.println("Cannot add additional item in Deluxe Burger");
    }
}
