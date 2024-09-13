package ReturningFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingCapableInterface {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(1);
        CapableInterface task1 = new CapableInterface("Ayush Raghuwanshi");
        CapableInterface task2 = new CapableInterface("Tanisha Suryvanshi");
        CapableInterface task3 = new CapableInterface("Rainbow Bhai");
        CapableInterface task4 = new CapableInterface("Ansh Raghuwanshi");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.println("Full name is : "+ name1.get());
        System.out.println("Full name is : "+name2.get());
        System.out.println("Full name is : "+name3.get());
        System.out.println("Full name is : "+name4.get());
        service.isShutdown();

        

    }
}
