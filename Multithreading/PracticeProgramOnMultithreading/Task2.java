package PracticeProgramOnMultithreading;

public class Task2 extends Thread {
    @Override
    public void run() {
        try{
            Thread.sleep(4000);
            System.out.printf("\n From inside run %s ", getState());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    
}
