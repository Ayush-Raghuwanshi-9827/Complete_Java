package Multithreading;

public class FirstTask extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i+ " ");
        }
        System.out.printf("\n %sTask first is complete", Thread.currentThread().getName());

    }
    
}
