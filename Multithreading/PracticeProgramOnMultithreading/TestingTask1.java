package PracticeProgramOnMultithreading;

public class TestingTask1 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task1 t2 = new Task1();

        t1.start();
        t2.start();
    }
}
