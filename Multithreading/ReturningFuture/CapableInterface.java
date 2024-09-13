package ReturningFuture;

import java.util.concurrent.Callable;

public class CapableInterface implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.printf("\n Name Coming from server %s \n", name);
         Thread.sleep(5000);
         return name;
    }
    private final String name;
         CapableInterface(String name ){
            this.name = name;
        }
    
}
