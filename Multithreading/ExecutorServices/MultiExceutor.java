package ExecutorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiExceutor {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService services = Executors.newFixedThreadPool(2);
        PrintTask t1 = new PrintTask('*');
        PrintTask t2 = new PrintTask('&');
        PrintTask t3 = new PrintTask('%');
        PrintTask t4 = new PrintTask('#');
        services.submit(t1);
        services.submit(t2);
        services.submit(t3);
        services.submit(t4);
        services.shutdown();
        System.out.println("*******************1");
        if (!services.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("*******************2");
            services.shutdownNow();
        }
    }
}
