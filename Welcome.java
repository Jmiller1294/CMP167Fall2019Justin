import java.util.Scanner;


public class Welcome {

		public static void main(String[] args) {
		
			String welcome = "welcome to java world";
		    System.out.println(welcome);
			
		    Scanner input = new Scanner(System.in);
		    
		    System.out.println("What is your name? I'm a program");
		    
		    String name = input.nextLine();
		    
		    System.out.println("Nice to meet you, "+name+ "!");
		}
		
}
