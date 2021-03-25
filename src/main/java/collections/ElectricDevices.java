package collections;

import collections.devices.Blender;
import collections.devices.Device;
import collections.devices.VacuumCleaner;
import collections.devices.Washer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ElectricDevices {
    public static void main(String[] args) {
        List<Device> activeDevicesList = new ArrayList<>();
        activeDevicesList. add(new Blender(10, 20, "Red"));
        activeDevicesList. add(new Washer(20,220, "Aquamarine"));
        activeDevicesList. add(new Washer(40,220, "Blue"));
        activeDevicesList. add(new VacuumCleaner(100, 110, "Yellow"));

        System.out.println( "Full power of active devices: " + activeDevicesList.stream().mapToInt(o -> o.getPower()).sum());

        System.out.println("Devices sorted by power");
        activeDevicesList.stream().sorted(Comparator.comparingInt(o -> o.getPower())).forEach(System.out::println);

        System.out.println("Some devices founded by various parameters");
        activeDevicesList.stream().filter(o -> o.getColour().equals("Red")).forEach(System.out::println);
        activeDevicesList.stream().filter(o -> 10 < o.getPower() && o.getPower() < 100).forEach(System.out::println);

    }
}