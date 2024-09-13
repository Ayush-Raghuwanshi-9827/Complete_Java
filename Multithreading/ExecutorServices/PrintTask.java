package ExecutorServices;

public class PrintTask implements Runnable{

    @Override
    public void run(){
          for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
              System.out.println(e.getMessage());
            }
              System.out.printf("%s:%s", character, i);
          }
          System.out.printf("\n %s Task is Completed \n",
                Thread.currentThread().getName()
          );
    }
    private char character;
    public PrintTask(char character){
        this.character = character;
    }
}
