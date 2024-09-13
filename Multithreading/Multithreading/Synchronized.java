package Multithreading;
public class Synchronized {
       
    public static void main(String[] args) {
        Counter count = new Counter();
        UpdaterThread t1 = new UpdaterThread(count);
        UpdaterThread t2 = new UpdaterThread(count);
        try {
            t1.start();
            t2.start();
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            System.out.printf( "%s", e.getMessage());
        }
       System.out.println(count.getCounter());



    }
}