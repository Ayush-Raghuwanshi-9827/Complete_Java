package Convert;

public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        System.out.println(newtonMethod(9));
    }
    static double newtonMethod(int num){
        double tol = 0.001;
        double root;
        double x = num;
        while (true) {
            root = 0.5 * (x + (num / x));
            double ans = x - root;
            if (ans < tol) {
                break;
            }
            x = root;
        } 
        return root;
    }
}
