/**
 * 
 * @author Justin Miller
 *
 */
import java.util.Scanner;
public class LoopAssignment {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;
		int ic = 1;
		
		for (int i = 1; i <= num; i++) {
	         System.out.println(i);
			 sum += i;
		}
		
	    while(ic <= num) {
		   System.out.println(ic);
		   ic++;
	    }
	
	  
		
		
		
		System.out.println("The sum is: " + sum);
		
		
		
		
		
		
		
	}

}
