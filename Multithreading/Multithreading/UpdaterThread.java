package Multithreading;

public class UpdaterThread extends Thread {
    private final Counter counter;

    public UpdaterThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            counter.IncrementCounter();
        }
    }
}
