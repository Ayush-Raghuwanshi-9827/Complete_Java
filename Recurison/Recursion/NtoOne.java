package Recursion;

public class NtoOne {
    public static void main(String[] args) {
        Reverse(5);
    }   
    static void ans(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        ans(n-1);
    } 
    static void Reverse(int n){
        if (n==0) {
            return;
        }
        Reverse(n-1);
        System.out.println(n);
    } 
}

