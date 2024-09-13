package Multithreading;
public class Basic {

    public static void main(String[] args) {
        long currTime = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i+ " ");
        }
        System.out.println("Task first is complete");
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i+"#"+ " ");
        }
        System.out.println("Second task is complete");
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i+"&"+ " ");
        }
        System.out.println("Third task is completed");
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken %s", endTime - currTime);
    }
}