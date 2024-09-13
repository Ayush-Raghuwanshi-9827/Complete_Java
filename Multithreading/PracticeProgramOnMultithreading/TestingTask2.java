package PracticeProgramOnMultithreading;

public class TestingTask2 {
    public static void main(String[] args)  throws InterruptedException{
        Task2 t1 = new Task2();
        System.out.printf("\n Create the Thread %s", t1.getState());

        t1.start();
        t1.join();
        System.out.printf("\n thread Finished %s", t1.getState());
    }
}
