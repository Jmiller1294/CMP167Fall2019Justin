/**
 * 
 * Justin Miller
 * @created 9/26/2019
 *
 */
import java.util.Scanner;
import java.util.Random;



public class GuessGame {
	static Scanner in = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		//introduce the program
		System.out.println("Welcome to Guessing 3000");
		System.out.println("Would you like to play?");
		String answer = in.next();
		
		while (answer.equalsIgnoreCase("yes")) {
		System.out.println("Enter a number from 1 - 10:");
		
			int userNumber = in.nextInt();
			int pcNumber = rand.nextInt(10) +1;
		
			if (userNumber == pcNumber)
			{
			System.out.println("You Won!");
			}
			else {
			System.out.println("You lost!");
			System.out.println("The pc chose " + pcNumber);
			}
			System.out.println("Would you like to play again");
			answer = in.next();
		}
		System.out.println("Ok come back soon!");
		
	}

}
