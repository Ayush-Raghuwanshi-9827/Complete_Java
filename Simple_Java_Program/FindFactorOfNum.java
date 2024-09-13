import java.util.ArrayList;

public class FindFactorOfNum {
    public static void main(String[] args) {
        int n = 40;
        factor1(n);
        System.out.println("And");
        factor2(n);
    }
    // 1 Approch Time Compexcity is O(n)
    static void factor1(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    // 2 Approch time Compexcity ans Space Compexcity is O(squrt(N))
     static void factor2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n / i == i){
                    System.out.print(i + " ");
                }else{
                System.out.print(i + " ");
                list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
            
        }
    }

}
