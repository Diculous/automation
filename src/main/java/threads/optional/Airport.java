package threads.optional;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Airport {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(5);

        for(int i = 1; i <= 10; i++) {

            try {
                TimeUnit.MILLISECONDS.sleep(100);
                Plane plane = new Plane(String.valueOf(i), semaphore);
                plane.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}