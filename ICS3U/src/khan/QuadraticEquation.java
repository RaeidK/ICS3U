package khan;
/* Quadratic Equation
 * Inputs a b c and calculates roots
 * March 21 2016
 * Raeid Khan
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
	    int a;
		int b;
		int c;	
		double xPositive;
		double xNegative;
		
		System.out.println("What is number A?");
		a = Integer.parseInt(scan.nextLine());
		
		System.out.println("What is number B?");
		b = Integer.parseInt(scan.nextLine());
		
		System.out.println("What is number C?");
		c = Integer.parseInt(scan.nextLine());
		
		//Processing 
		xPositive= (-b+(Math.sqrt(Math.pow(b,2) - 4*a*c)))/(2*a);
		xNegative= (-b-(Math.sqrt(Math.pow(b,2) - 4*a*c)))/(2*a);
		
	    //Output
		if ((Math.pow(b,2) - 4*a*c) < 0){
			System.out.println("There are no roots");
		}
	    else if ((Math.pow(b,2) - 4*a*c) == 0){
				System.out.println("There is only one real root");
				System.out.println("x = " + df.format(xPositive));
	    }		
		else {
			System.out.println("x = " + df.format(xPositive));
			System.out.println("x = " + df.format(xNegative));	
		}			 
				
	}

}
