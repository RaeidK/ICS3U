package khan;
/*
 * Simple if statement program
 * Program inputs a number selected by user than checks if positive or negative and checks if divisible by 7
 * March 22 2016
 * Raeid Khan
 */

import java.util.Scanner;

public class SimpleIfStatementProgram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		//Input
		System.out.println("What is your number?");
		num = Integer.parseInt(scan.nextLine());

		//Processing and outputs
		if (num<0){
		
			System.out.println("The number is negative.");
	}
		else if (num==0)
			System.out.println("The number is 0.");
		
		else
			System.out.println("The number is positive");
				
        if (num%7==0){
        	System.out.println("The number is divisible by 7.");
    }
        else
        	System.out.println("The number is not divisible by 7.");

}}
