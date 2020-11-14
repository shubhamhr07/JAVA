package poly;

class Car{
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheel;

    public Car(String name, int cylinder) {
        this.name = name;
        this.engine = true;
        this.cylinder = cylinder;
        this.wheel = 4;

    }
    public String feature(){
        return "Ordinary Car";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheel() {
        return wheel;
    }
}

class Audi extends Car{
    public Audi(){
        super("audi",8);
    }

    @Override
    public String feature() {
        return "fully Automatic system with grate User Interface.";
    }
}
class Gmc extends Car{
    public Gmc(){
        super("GMC",10);
    }
}
class Bmw extends Car{
    public Bmw(){
        super("BMW",6);
    }

    @Override
    public String feature() {
        return "Automatic Transmission 12-speed with Sports mode.";
    }
}


public class Main {

    public static void main(String[] args) {
        Car car0 = new Gmc();
        System.out.println("Car Name: "+car0.getName());
        System.out.println("Feature : "+car0.feature());
        Car car1 = new Audi();
        System.out.println("Car Name: "+car1.getName());
        System.out.println("Feature : "+car1.feature());
        Car car2 = new Bmw();
        System.out.println("Car Name: "+car2.getName());
        System.out.println("Feature : "+car2.feature());
    }
}
