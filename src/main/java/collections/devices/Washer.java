package collections.devices;

public class Washer extends Device {

    public Washer(int power, int voltage, String colour) {
        super(power, voltage, colour);
    }

    @Override
    public String toString() {
        return "Washer{" + super.toString();
    }
}
