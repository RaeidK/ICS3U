package khan;
/*
 * Random name program
 * Program asks for name then states if they like it or not
 * March 23 2016
 * Raeid Khan
 */
import java.util.Scanner;

public class NamePercentage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Variable
		int num ;
		
		String name;
		//Random number selected
		num = (int)(Math.random() * 10);
		//Output and Processing 
		System.out.println("What is your name");
		name = scan.nextLine();
		
		if (num <=3 ){
		System.out.println("I hate that name.");
		}
		
		else
		System.out.println("My favourite name.");
			
			
		}
	}


