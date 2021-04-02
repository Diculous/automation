package threads;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Car extends Thread{

    int number;
    int parkingTime;
    int waitingTime;
    int parkingPlaces;
    ArrayList<Car> cars;

    Car(int number, int parkingTime, int waitingTime, int parkingPlaces, ArrayList<Car> cars) {
        this.number = number;
        this.parkingTime = parkingTime;
        this.cars = cars;
        this.waitingTime = waitingTime;
        this.parkingPlaces = parkingPlaces;
    }

    @Override
    public void run() {
        try {
            if (cars.size() < parkingPlaces) {
                takingTheParkingPlace();
            }
            else {
                while (waitingTime > 0) {
                    waitingTime--;
                    TimeUnit.SECONDS.sleep(1);
                    if (cars.size() < parkingPlaces) {
                        takingTheParkingPlace();
                        break;
                    }
                    if (waitingTime == 0) {
                        System.out.println("Car " + number + " cannon wait anymore");
                    }
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     void takingTheParkingPlace() throws InterruptedException {
        cars.add(this);
        System.out.println("Car " + number + " your parking place is mine!");
        TimeUnit.SECONDS.sleep(parkingTime);
        System.out.println("Car " + number + " is leaving");
        cars.remove(this);
    }
}