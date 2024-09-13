package CompleteMultithreading;

public class MyAnotherThread extends Thread {

    @Override
    public void run() {
        // Task for thread

        for(int i=10; i >=1; i--){
            System.out.println("Another Thread : "+ i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
    
}
