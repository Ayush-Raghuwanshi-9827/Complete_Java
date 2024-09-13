package PracticeProgramOnMultithreading;

public class Signal extends Thread {
    @Override
    public synchronized void run() {
        System.out.println("Stop : RED SIGNAL");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
           System.out.println(e.getMessage());
        }
        System.out.println("Wait : YELLOW SIGNAL");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
           System.out.println(e.getMessage());
        }
        System.out.println("Go : GREEN SIGNAL");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
           System.out.println(e.getMessage());
        }
    }
    
}
