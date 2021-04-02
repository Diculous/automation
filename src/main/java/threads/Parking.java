package threads;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Parking {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 1; i <= 23; i++) {

            try {

                TimeUnit.SECONDS.sleep(1);
                Car car = new Car(i, 10, 1, 5, cars);
                car.start();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}