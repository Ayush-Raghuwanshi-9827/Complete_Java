public class StringSearch {
    public static void main(String[] args) {
        String name = "Ayush";
        char target = 's';
        boolean ans = search(name,target);
        System.out.println(ans);
    }
    static boolean search(String str1, char target){
        if(str1.length() == 0){
            return false;
        }

        for(int i = 0; i < str1.length(); i++){
            if(target == str1.charAt(i)){
                return true;
            }

            
        }
        return false;
        
    }

 }

