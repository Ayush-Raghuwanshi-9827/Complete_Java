package Collectionandgenerics;

public class VariableArgument {
    /* 
       In advance java varargs allow method to accept any number of arguments.
       Declared using an ellipsis(...) eg, void method(int... nums).
       Internal Handling: treated as arrays, eg, int... nums is int[] nums.
       Placement : Must be the last in the methods parameters.

    */
    public static void main(String[] args) {
        System.out.println(Sum(2,4,6,8,1));
        System.out.println(Sum(2,3,4,5));
    }
    // In this type of method we can pass the multiple arguments and minimum two argument must be Input in the function
    public static int Sum(int... nums){
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }
}