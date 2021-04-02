package threads.optional;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Plane extends Thread{

    String name;
    Semaphore semaphore;

    public Plane(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Plane №" + name + " entering the runway");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Plane №" + name + " flied away");
            System.out.println("Runway clear");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
