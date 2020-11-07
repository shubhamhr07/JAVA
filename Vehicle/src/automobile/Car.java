package automobile;

public class Car extends Vehicle{
    private int seats;
    public Car(int seats) {
        super(4,50);
    }

    public int getSeats() {
        return seats;
    }
}

class LowRider extends Car{
    private boolean isManual;
    public LowRider(boolean isManual) {
        super(2);
    }

    public boolean isManual() {
        return isManual;
    }
}
