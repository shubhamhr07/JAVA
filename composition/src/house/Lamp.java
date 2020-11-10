package house;
public class Lamp {
    private int brightness;
    private String shape;

    public Lamp(int brightness, String shape) {
        this.brightness = brightness;
        this.shape = shape;
    }
    public void turnLampOn(){
        System.out.println("Lamp is now On at Brightness "+brightness);
    }

    public int getBrightness() {
        return brightness;
    }

    public String getShape() {
        return shape;
    }
}
