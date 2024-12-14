import java.util.Scanner;
import java.util.Random;
public class NumberGuessGame {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int number_guess = r.nextInt(100)+1;
        int guess = 0;
        int attemps = 0;
        while(guess!=number_guess)
        {
            System.out.println("Enter a number:");
            guess = sc.nextInt();
            attemps++;
            if(guess<number_guess)
            {
                System.out.println("Too Low!");
            }else if(guess>number_guess){
                System.out.println("Too high!");
            }else{
                System.out.println("Congrats! you have guessed a number "+" you took "+attemps+" attemps");
            }
        }

    }
    
}
