 package Convert;

class CountDigit {

    public static void main(String[] args) {
        System.out.println(count2(2345));
    }
    static int count(int num){
        if(num == 0){
           return 1;
        }
        int counter = 0;
        while (num > 0) {
            num /= 10;
            counter++;
        }
        return counter;
    }
    static int count2(int num){
        if(num == 0){
            return 1;
        }
        return (int)(Math.log10(num) + 1);
    }
}