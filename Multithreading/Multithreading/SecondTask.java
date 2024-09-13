package Multithreading;

public class SecondTask extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i+"#"+ " ");
        }
        System.out.printf(" \n %s Second task is complete", Thread.currentThread().getName());
       
    }
}
