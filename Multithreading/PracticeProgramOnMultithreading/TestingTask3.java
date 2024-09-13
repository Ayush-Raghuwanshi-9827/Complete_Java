package PracticeProgramOnMultithreading;


public class TestingTask3 {
    public static void main(String[] args) throws InterruptedException {
        Task3 t1 = new Task3();
        Task3 t2 = new Task3();
        Task3 t3 = new Task3();

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }
}
