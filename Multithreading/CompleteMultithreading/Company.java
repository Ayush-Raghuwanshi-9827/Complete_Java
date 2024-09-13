package CompleteMultithreading;

public class Company {

    int n;
    boolean f = false;

    synchronized public void producee(int n) throws InterruptedException{
        if (f) {
            wait();
        }
        this.n = n;
        System.out.println("Produce : "+ this.n);
        f = true;
        notify();
    }

    
    synchronized public int consume() throws InterruptedException{
        if (!f) {
            wait();
        }
        System.out.println("Consumed : "+ this.n);
        f = false;
        notify();
        return this.n;
    }
    
}
