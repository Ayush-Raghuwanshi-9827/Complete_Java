package PracticeTaskExecutorServices;

public class Task1Print implements Runnable{
    @Override
    public void run() {
        System.out.println("printing number started");
        for(int i=0; i <= 10; i++){
            System.out.printf("\n %s", i);
        }
    }
    
}
