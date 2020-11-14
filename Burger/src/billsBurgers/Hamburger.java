package billsBurgers;
import java.util.Scanner;

public class Hamburger {
    private String bread;
    private int grandTotal;
    private String meat;
    private String additions= "";
    private int additionPrice;
    String[] addon={"Tettuce, ","Carrot, ","Tomato, ","Onion, "};

    public Hamburger(String bread,String meat) {
        this.bread = bread;
        this.meat = meat;
    }
    Scanner s = new Scanner(System.in);

    public void addOns(){
        boolean choice;
        for(int i=0;i<4;i++){
            System.out.println("add "+addon[i]);
            choice = s.nextBoolean();
            if(choice) {
                this.additions += addon[i];
                additionPrice+=20;
            }
        }
    }

    public String getBread() {
        return bread;
    }

    public int getGrandTotal() {
        return grandTotal;
    }

    public String getMeat() {
        return meat;
    }

    public String getAdditions() {
        return additions;
    }
}
