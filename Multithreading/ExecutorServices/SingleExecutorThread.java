package ExecutorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecutorThread{

    public static void main(String[] args) {
        ExecutorService services =  Executors.newSingleThreadExecutor();
        PrintTask t1 = new PrintTask('*');
        PrintTask t2 = new PrintTask('%');
        PrintTask t3 = new PrintTask('&');
        services.submit(t1);
        services.submit(t2);
        services.submit(t3);
    }
    
}
