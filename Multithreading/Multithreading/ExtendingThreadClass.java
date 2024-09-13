package Multithreading;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long StartTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();
        System.out.println("\n Starting first task");
        t1.start();
        System.out.println("\n Starting Second task");
        t2.start();
        System.out.println("\n Starting Third task");
        t3.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("%s", endTime - StartTime);
    }
}
