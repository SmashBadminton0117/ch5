import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {
        //pick a random number
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        
        //message
        System.out.print("I'm thinking of a number between 1 and 100 (including both). \nCan you guess what it is? ");
        System.out.print("\nType in a number! ");
        
        int number = random.nextInt(100) + 1;
        int guess;
        
        //output
        //Guess #1
        guess = in.nextInt();
        if (guess != number) {
				if (guess > number) {
					System.out.println("\nYour guess was too high" + number);
					System.out.print("Take another guess..! ");
				} else if (guess < number) {
					System.out.println("\nYour guess was too low");
					System.out.print("Take another guess..! ");
				} else {
					System.out.print("You got it!");
			}
		}
		
		//Guess #2
		guess = in.nextInt();
		if (guess != number) {
				if (guess > number) {
					System.out.println("\nYour guess was too high");
					System.out.print("Take another guess..! ");
				} else if (guess < number) {
					System.out.println("\nYour guess was too low");
					System.out.print("Take another guess..! ");
				} else {
					System.out.print("You got it!");
			}
		
		//Guess #3
		guess = in.nextInt();
		if (guess != number) {
					System.out.print("\nYou didn't get it this time... \nThe number was: " + number);
				} else {
					System.out.print("You got it!");
				}
			}
		}
	}
