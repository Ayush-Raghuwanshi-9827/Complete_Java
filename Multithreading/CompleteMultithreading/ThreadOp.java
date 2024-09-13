package CompleteMultithreading;

        
    class UserThread extends Thread {
            public void run() {
                System.out.println("This is a user thread");
            }
    }

    public class ThreadOp {
    
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Programm Started");

        int x = 56 + 23;
        System.out.println("x : "+ x);

        var t = Thread.currentThread();

        System.out.println(t.getName());
        t.setName("MyMainThread");
        System.out.println("Current Thread name : " + t.getName());

        System.out.println(t.getId());
        Thread.sleep(5000);        
        System.out.println("Programm Ended");

        var t2 = new UserThread();
        System.out.println(t2.isDaemon());
        t2.start();

    }
    
}
