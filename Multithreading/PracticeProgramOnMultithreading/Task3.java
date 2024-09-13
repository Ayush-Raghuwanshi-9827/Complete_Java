package PracticeProgramOnMultithreading;

public class Task3 extends Thread {
        @Override
        public void run() {
            System.out.printf("\n %s is Started",Task3.currentThread().getName());
            try {
                Task3.sleep(5000);
            } catch (InterruptedException e) {
               System.out.println(e.getMessage());
            }
            System.out.printf("\n %s is Ended",Task3.currentThread().getName());
        }
    }
