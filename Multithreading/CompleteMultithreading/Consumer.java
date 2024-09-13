package CompleteMultithreading;

public class Consumer extends Thread {

    Company company;

    public Consumer(Company company) {
        this.company = company;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.company.consume();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
