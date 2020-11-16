package billsBurgers;

public class Hamburger {
    private int basePrice;
    private String bread;
    private String meat;

    private String addOn1;
    private int addOn1Price;
    private String addOn2;
    private int addOn2Price;
    private String addOn3;
    private int addOn3Price;
    private String addOn4;
    private int addOn4Price;

    public Hamburger(String bread, String meat) {
        this.basePrice = 50;
        this.bread = bread;
        this.meat = meat;
    }

    public void getAddOn1(String name, int price) {
        this.addOn1 = name;
        this.addOn1Price = price;
    }

    public void getAddOn2(String name, int price) {
        this.addOn2 = name;
        this.addOn2Price = price;
    }

    public void getAddOn3(String name, int price) {
        this.addOn3 = name;
        this.addOn3Price = price;
    }

    public void getAddOn4(String name, int price) {
        this.addOn4 = name;
        this.addOn4Price = price;
    }

    public int addOns() {
        int price = basePrice;
        System.out.println("Hamburger with " + this.bread + "And "+this.meat+ " Bread for price Rs" + this.basePrice);
        if (addOn1 != null) {
            System.out.println(this.addOn1 + " is added for Rs" + this.addOn1Price);
            price += addOn1Price;
        }
        if (addOn2 != null) {
            System.out.println(this.addOn2 + " is added for Rs" + this.addOn2Price);
            price += addOn2Price;
        }
        if (addOn3 != null) {
            System.out.println(this.addOn3 + " is added for Rs" + this.addOn3Price);
            price += addOn3Price;
        }
        if (addOn4 != null) {
            System.out.println(this.addOn4 + " is added for Rs" + this.addOn4Price);
            price += addOn4Price;
        }
        return price;
    }
}


