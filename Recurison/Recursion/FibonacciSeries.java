package Recursion;
public class FibonacciSeries {
    public static void main(String[] args) {
        for(int i=0; i < 50 ; i++){
            System.out.println(FibonacciSeriesFormula(i));
        }
     

    }
    static int FibonacciSeriesFormula(int n){
        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }
    public static void fibnacciNum(int n1, int n2, int n){
        if(n == 0){
            return;
        }
        int ans = n1 + n2;
        System.out.println(ans);
        n1 = n2;
        n2 = ans;
        
        n--;
        fibnacciNum(n1, n2, n);
    }
}
