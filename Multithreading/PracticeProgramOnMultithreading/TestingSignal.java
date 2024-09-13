package PracticeProgramOnMultithreading;
public class TestingSignal {

    public static void main(String[] args) throws Exception{
        Signal s1 = new Signal();
        Signal s2 = new Signal();   
        Signal s3 = new Signal();
        s1.start();
        s1.join();
        s2.start();
        s2.join();
        s3.start();

    }
}