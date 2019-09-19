/**
 * 
 * @author Justin Miller
 *
 */
//program asks a user for their age and sees if the user can drink alcohol

import java.util.Scanner;
public class Unit4 {
	public static void main(String[] args) {
		
		int age;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will check if you are legal to drink alcohol");
		
		//input
		System.out.print("Enter your name: ");
		name = input.nextLine();
		System.out.printf("Ok %s, Enter your age: " ,name );
		age = input.nextInt();
		
		//logic
		if(age >= 21)
		{
			System.out.println("You can drink alcohol");
		}
		else 
		{
			System.out.println("You cant drink alcohol");
		}
		
		
		
		
		
		
	}

}
