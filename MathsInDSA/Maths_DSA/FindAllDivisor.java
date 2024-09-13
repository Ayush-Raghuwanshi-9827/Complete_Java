package Convert;

import java.util.ArrayList;

public class FindAllDivisor {
    public static void main(String[] args) {
        divisor(36);
    }
    static void divisor(int num){
       
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(i * i == num){
             list.add(i);
            }else if(num % i == 0){
                list.add(i);
                list.add(num / i);
            }
            
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j) + " " + "is a divisor of "+ num);
        }
        
    }
}
