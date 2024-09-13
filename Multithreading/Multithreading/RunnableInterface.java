package Multithreading;

public class RunnableInterface implements Runnable {
        @Override
        public void run() {
        System.out.printf("\n Task %c Started :  \n", targetChar);
        long MainStartTime = System.currentTimeMillis();
            for (int i = 1; i <= 100; i++) {
                System.out.printf("%s:%c  ", i, targetChar);
            }
            System.out.printf("\n %s:%cTask first is complete",
               Thread.currentThread().getName(),targetChar);
        long MainEndTime = System.currentTimeMillis();
        System.out.printf("\n Total Time Taken by %c Method : %s", targetChar, MainEndTime - MainStartTime);
        }
        private final char targetChar;
        RunnableInterface(char targetChar){
            this.targetChar = targetChar;
        }
}
