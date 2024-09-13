package PracticeTaskExecutorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Task2Print t1 = new Task2Print();
        Task2Print t2 = new Task2Print();
        Task2Print t3 = new Task2Print();
        Task2Print t4 = new Task2Print();
        Task2Print t5 = new Task2Print();

        service.submit(t1);
        service.submit(t2);
        service.submit(t3);
        service.submit(t4);
        service.submit(t5);
        
        service.shutdown();
        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("Task Not Completed");
            service.shutdownNow();
        }

    }
    
}
