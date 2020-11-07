package automobile;

public class Vehicle {
    private int engine;
    private int size;
    private int currentSpeed = 0;
    private int currentDirection = 0;
    String currentGear = "N";

    public Vehicle(int engine, int size) {
        this.engine = engine;
        this.size = size;
    }
    public int getEngine() {
        return engine;
    }
    public int getSize() {
        return size;
    }
    public void move(int speed, int direction,String gear){
        currentSpeed += speed;
        currentDirection += direction;
        currentGear = gear;
        System.out.println("car is moving at speed "+currentSpeed+"Km/h,at gear="+currentGear+" at direction "+currentDirection+" Degrees");
    }
    public void move(int speed,int direction){
        currentSpeed += speed;
        if (currentSpeed==0)
            currentGear = "N";
        else if(currentSpeed>=0 && currentSpeed<15)
            currentGear = "1";
        else if(currentSpeed>=15 && currentSpeed<30)
            currentGear = "2";
        else if(currentSpeed>=30 && currentSpeed<40)
            currentGear = "3";
        else if(currentSpeed>=40 && currentSpeed<60)
            currentGear = "4";
        else
            currentGear = "5";
        currentDirection += direction;
        System.out.println("car is moving at speed "+currentSpeed+"Km/h,at gear="+currentGear+" (AUTO) at direction "+currentDirection+" Degrees");
    }
}
