package khan;
/*Arithmetic Expression program
 * Number inputing with various equations
 * March 10 2016
 * Raeid Khan
 */

import java.util.Scanner;

public class ArithmeticExpression {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Assigning/declaring variables
		double num1;
		double num2;
		double num3;
		double num4;
		double num5;
		
		//Inputs
		System.out.println("What is the first number?");
		num1 = Double.parseDouble(scan.nextLine());
		
		System.out.println("What is the second number?");
		num2 = Double.parseDouble(scan.nextLine());
		
		System.out.println("What is the third number?");
		num3 = Double.parseDouble(scan.nextLine());

		System.out.println("What is the fourth number?");
		num4 = Double.parseDouble(scan.nextLine());
		
		System.out.println("What is the fifth number?");
		num5 = Double.parseDouble(scan.nextLine());
		
		//Outputs
		System.out.println("The sum of all five numbers: "+(num1+num2+num3+num4+num5));
		
		System.out.println("The result after subtracting the second number from the third: "+(num3-num2));
		
		System.out.println("The product of the first and fifth numbers "+(num1*num5));
		
		System.out.println("The quotient of the fourth number divided by the second: "+(num4/num2));
		
		System.out.println("The remainder when dividing the fourth number by the second: "+(num4%num2));
		
		System.out.println("The first number raised to the power of the third number: "+(Math.pow(num1,num3)));
		
		System.out.println("The square root of the fifth number: "+(Math.sqrt(num5)));
		
		
		
		
	}

}
