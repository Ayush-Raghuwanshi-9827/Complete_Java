package Multithreading;


public class CheckRunnable {
    public static void main(String[] args)  throws Exception {
        RunnableInterface r1 = new RunnableInterface('*');
        RunnableInterface r2 = new RunnableInterface('%');
        RunnableInterface r3 = new RunnableInterface('$');
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        // setpriority is used to set the priority of the thread
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        // Join method is used to wiat utnil jion thread will not completed
        t2.join();
    }
}
