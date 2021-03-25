package collections.devices;

public class Blender extends Device {

    public Blender(int power, int voltage, String colour) {
        super(power, voltage, colour);
    }

    @Override
    public String toString() {
        return "Blender{" + super.toString();
    }
}
