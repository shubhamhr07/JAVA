package house;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall(25,"lime");
        Wall wall2 = new Wall(20,"lime");
        Wall wall3 = new Wall(25,"Yellow");
        Wall wall4 = new Wall(25,"lime");
        Roof roof = new Roof(11,"White");
        Lamp lamp = new Lamp(75,"cone");

        Room r1 = new Room(wall1,wall2,wall3,wall4,roof,lamp);

        lamp.turnLampOn();

        System.out.println("Roof Height: "+roof.getHeight());
    }
}
