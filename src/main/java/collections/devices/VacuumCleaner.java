package collections.devices;

public class VacuumCleaner extends Device {

    public VacuumCleaner(int power, int voltage, String colour) {
        super(power, voltage, colour);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" + super.toString();
    }
}
