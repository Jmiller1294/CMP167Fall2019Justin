/**
 * 
 * @author Justin Miller
 *
 */

import java.util.Scanner;
import java.io.StringWriter;
import java.io.PrintWriter;


public class Task {

	public static void main(String[] args) {
		
		int age = 27;
		
		String borough = "Manhattan";
		Scanner in = new Scanner(borough);
		
		String place = in.next();
	
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		pw.print("Justin Miler");
		String name = sw.toString();
		
		
		
		System.out.printf("Hello my name is %s from %s %nand I am %d years old" ,name  ,place, age);
		

	}

}
