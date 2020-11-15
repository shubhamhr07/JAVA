package billsBurgers;

public class HealthyBurger extends Hamburger {

    private String HealthyAddOn1;
    private int HealthyAddOn1Price;
    private String HealthyAddOn2;
    private int HealthyAddOn2Price;

    public HealthyBurger() {
        super("Brown", "Grilled");
    }

    public void getHealthyAddOns1(String name, int price) {
        this.HealthyAddOn1 = name;
        this.HealthyAddOn1Price = price;
    }

    public void getHealthyAddOns2(String name, int price) {
        this.HealthyAddOn2 = name;
        this.HealthyAddOn2Price = price;
    }

    @Override
    public int addOns() {
        int price = super.addOns();
        if (HealthyAddOn1 != null) {
            System.out.println(this.HealthyAddOn1 + " is added for Rs" + this.HealthyAddOn1Price);
            price += HealthyAddOn1Price;
        }
        if (HealthyAddOn2 != null) {
            System.out.println(this.HealthyAddOn2 + " is added for Rs" + this.HealthyAddOn2Price);
            price += HealthyAddOn2Price;
        }
        return price;
    }
}
