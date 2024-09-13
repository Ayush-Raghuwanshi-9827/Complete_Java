package PracticeProgramOnMultithreading;

public class Task1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Hello I am from "+ Thread.currentThread().getName());            
        }
    }
}
