package CompleteMultithreading;

public class Producer extends Thread 
{

    Company company;

    Producer(Company company){
        this.company = company;
    }

    @Override
    public void run() {
        int i =1;
        while (true) {
            try {
                this.company.producee(i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException exception){
                exception.printStackTrace();
            }
            i++;
        }
    }

}
