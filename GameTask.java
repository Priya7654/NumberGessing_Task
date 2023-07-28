
import java.util.Random;
import java.util.Scanner;

public class GameTask {

    public static void main(String[] args) {
        
        Random random_num= new Random();
        int guess_num = random_num.nextInt(100);
        int turns =0 ;
        Scanner scan= new Scanner(System.in);
        
        System.out.println(" Guess a number between 1 and 100 . you will have 10 turne! ");
        System.out.println("best of luck");
    
        int guess;
        int i=0;
        boolean win =false;
        while(win==false){
            guess = scan.nextInt();
            turns++ ;
            
            if(guess == guess_num){
                win = true;
            }
            else if(i>8){
                System.out.println("You loose! the right answer was:"+guess_num);
                return;
            }
            else if(guess<guess_num){
                i++;
                System.out.println("You guess is lower than the right Guess! Turns lift:"+(10-i));
            }
            else if(guess>guess_num){
                i++;
                System.out.println(" Your guess is Higher Than The Right guess! Turns left :"+(10-i));
            }
        }
        System.out.println("You win!");
        System.out.println("Then the number was"+guess_num);
        System.out.println("You used"+turns+" turns to guess the right number");
        System.out.println("Your score is "+ ((11-turns)*10)+"out of 100");
    
}
}
//        Scanner reader = new Scanner(System.in);
//        String play = "Yes";
//        // if loop is determine if we are going to play the game again
//
//        while (play.equals("Yes")) {
//            Random rand = new Random();
//            int readnum = rand.nextInt(100);
//            int guess = -1;
//            int tries = 0;
//            while (guess != readnum) {
//                System.out.println("Guess a number between 1 and 100 :");
//                guess = reader.nextInt();
//                tries++;
//
//                if (guess == readnum) {
//                    System.out.println("Awesome! You guessed the number!");
//                    System.out.println("It only took you" + tries + "guesses!");
//                    System.out.println("Would you like to play again? Yes or No: ");
//                    play = reader.next().toLowerCase();
//
//                } 
//                else if (guess > readnum) {
//                    System.out.println("Your guess is too high, try again.");
//                }
//                else {
//                    System.out.println("Your guess is too low, try again");
//                }
//            }
//        }
//        // while loop to cheak  if the game is over
//
//        reader.close();
//    }

