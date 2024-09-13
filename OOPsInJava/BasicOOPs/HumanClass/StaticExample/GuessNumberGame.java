package StaticExample;
import java.util.*;
import java.util.Random;


   class  Game {
    int randomNum;
    int input;
    public void takeInput(int in){
        this.input = in;
    }
    private static int noOfGuess;
    public void randomNumber(){
         Random random = new Random();
         randomNum = random.nextInt(100) + 1;
         
    }
    public void setNoOfGuess(){
       noOfGuess++;
    }
    public int getNoOfGuess(){
        return noOfGuess;
    }
    public int isCorrectNumber(){
        if(input == randomNum){
            return 0;
        }else if (input < randomNum){
            return 1;
        }else {
            return -1;
        }
    }


  }

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        Game user = new Game();  
        user.randomNumber();
        for(int i=0; i <= 100; i++){
            System.out.println("Enter a number betwwen 1 to 100: ");
            int inputFromUser = sc.nextInt();
            user.takeInput(inputFromUser);
            user.setNoOfGuess();
            int temp = user.isCorrectNumber();
            if(temp == 0){
                System.out.println("Your guess is rigth");
                break;
            }else if(temp == -1){
                System.out.println("Random number is lesser than your guess");
                System.out.println("Try Again !");
            } else if(temp ==1) {
                System.out.println("Random number is greater than your guess");
                System.out.println("Try Again !");
            }            
        }
        int score = user.getNoOfGuess();
        System.out.println("Your Score is : " + score);
    }
}
