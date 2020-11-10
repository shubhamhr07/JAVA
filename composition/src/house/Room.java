package house;

public class Room {
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Roof roof1;
    private Lamp lamp;


    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Roof roof1, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.roof1 = roof1;
        this.lamp = lamp;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Roof getRoof1() {
        return roof1;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
