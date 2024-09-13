public class FindTrailingINFactorial {
    public static void main(String[] args) {
        System.out.println(find(30));
    }
    static int find(int num){
        int res = 0;
        for (int i = 5; i <= num; i = i * i) {
            res += num / i;
        }
        return res;
    }
}
