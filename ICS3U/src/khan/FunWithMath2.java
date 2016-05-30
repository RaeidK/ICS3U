package khan;
/**
 * Raeid Khan
 * Fun with math 2
 * Program asks for 2 numbers then different with outputs it by different operations
 * May 30 2016
 */
import java.util.Scanner;

public class FunWithMath2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		double num1;
		double num2;
		double total;
		System.out.println("Enter two numbers.");
		num1 = Integer.parseInt(scan.nextLine());
		num2 = Integer.parseInt(scan.nextLine());

		System.out.println("Addition: " + add(num1, num2));
		System.out.println("Subtraction: " + sub(num1, num2));
		System.out.println("Multiplication: " + multiply(num1, num2));
		System.out.println("Division: " + divide(num1, num2));

	}

	public static double add( double num1, double num2)
	/** 
	 * Method adds the two inputed numbers
	 */
	{
		double total = num1 + num2;
		return total;
	}

	public static double sub( double num1, double num2)
	/** 
	 * Method subtracts the two inputed numbers
	 */
	{
		double total = num1 - num2;
		return total;
	}

	public static double multiply( double num1, double num2)
	/** 
	 * Method multiplies the two inputed numbers
	 */
	{
		double total = num1 * num2;
		return total;
	}

	public static double divide( double num1, double num2)
	/** 
	 * Method divides the two inputed numbers
	 */
	{
		double total = num1 / num2;
		return total;
	}
}



