package CompleteMultithreading;

public class MyThread implements Runnable {

    @Override
    public void run() {

        // Task for thread

        for(int i=1; i<= 10; i++) {
            System.out.println("value of i is: "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        //create obj of MyThread Class

        MyThread t1 = new MyThread();
        MyAnotherThread t2 = new MyAnotherThread();

        Thread th = new Thread(t1);

        th.start();
        t2.start();

    }
    

    
}
