package collections.devices;

public abstract class Device {

    int power;
    int voltage;
    String colour;

    public int getPower() {
        return power;
    }

    public Device(int power, int voltage, String colour) {
        this.power = power;
        this.voltage = voltage;
        this.colour = colour;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return
                "power=" + power +
                ", voltage=" + voltage +
                ", colour='" + colour + '\'' +
                '}';
    }
}