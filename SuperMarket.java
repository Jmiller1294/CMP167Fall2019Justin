/**
 * 
 * 
 * @author Justin Miller
 *
 */

import java.util.Scanner;
public class SuperMarket {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String answer;
		double budget;
		
		System.out.println("Welcome to Justin's SuperMarket");
		System.out.println("Would you like to see the inventory? ");
		
		answer = in.next();
		if (answer.equalsIgnoreCase("yes")) {
			System.out.printf(" 1.%s %n 2.%s %n " +  "3.%s" , "Pringles", "Prosecco", "Mozzarella Sticks"\n);
			System.out.println("Would you like to buy something? 1 2 3 0");
			int choice = in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("You selected Pringles");
				System.out.println("Thats $2.99");
				break;
			case 2:
				System.out.println("You selected Prosecco");
				System.out.println("Thats $79.99");
				break;
			case 3:
				System.out.println("Mozzarella Sticks");
				System.out.println("Thats $9.99");
				break;
			default: 
				System.out.println("Ok come bac soon!");
			}
		} else {
				System.out.println("Ok, come back soon");
		}
		
		
		
		
		
		
		
		
		
	}

}
