/**
 * 
 * @author Student
 *
 */
import java.util.Scanner;

public class MultTwo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Introduce the program
		System.out.println("Welcome, This program generates the product of two numbers");
		//Ask user for input
		System.out.println("Enter two numbers");
		
		//Wait for user input and store
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		//Calculate 
		int result = num1 * num2;
		
		//Display result
		System.out.println("Result is " + result);
		
		
		
	}
}
