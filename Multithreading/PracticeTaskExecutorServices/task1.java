package PracticeTaskExecutorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class task1  {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Task1Print t1 = new Task1Print();
        service.submit(t1);
        service.shutdown();
    }
    
}
