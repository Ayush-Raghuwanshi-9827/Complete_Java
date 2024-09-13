package Multithreading;

public class Counter {
    private int counter = 1;

    public synchronized void IncrementCounter(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
}
