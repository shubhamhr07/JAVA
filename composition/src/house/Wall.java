package house;

public class Wall {
    private int area;
    private String color;

    public Wall(int area, String color) {
        this.area = area;
        this.color = color;
    }
    public int getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }
}
