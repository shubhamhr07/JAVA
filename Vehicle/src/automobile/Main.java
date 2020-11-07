package automobile;

public class Main {

    public static void main(String[] args) {
        LowRider rex = new LowRider(true);
        System.out.println("Engine :"+rex.getEngine());
        System.out.println("Size   :"+rex.getSize());
        System.out.println("Seats  :"+rex.getSeats());
        System.out.println("Manual :"+rex.isManual());
        LowRider bot = new LowRider(false);
        rex.move(50,25,"4");
        rex.move(20,35,"5");
        rex.move(50,30);
    }
}
