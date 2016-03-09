package khan;
/*Console input program
 * March 9 2016
 * Raeid Khan
 */


import java.util.Scanner;

public class ConsoleInput {

	private static final String scan = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//*** variables
	    int motherBirth;
		int age;		// user's age
		int kidsAge;	// user's child's age
		String kid;
		String mother;

		//*** input
		System.out.println("What is the mother's name");
	    mother = scan.nextLine();
		
		System.out.println("What is the mother's child's name");
	    kid= scan.nextLine();
		
		System.out.println("What is the mother's age?");
        age = Integer.parseInt(scan.nextLine());
        
		System.out.println("What is the mother's child age?");
        kidsAge = Integer.parseInt(scan.nextLine());
		
		//*** processing
		motherBirth = age - kidsAge;
		
		//*** output
		System.out.println(mother+" ,you were "+motherBirth+ " years old, when you gave birth to " +kid+".");
	}

}
