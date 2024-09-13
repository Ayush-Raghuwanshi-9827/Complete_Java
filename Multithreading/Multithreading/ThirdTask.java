package Multithreading;

public class ThirdTask extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i+"&"+ " ");
        }
        System.out.printf(" \n %s Third task is completed", Thread.currentThread().getName());
      
    }
}
