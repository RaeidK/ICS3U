package khan;

import java.util.Scanner;

import hsa_new.Console; 

public class Grades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int grade;
		int numStudents;
		
		System.out.println("How many students?");
		numStudents = Integer.parseInt(scan.nextLine());
		
		for (int i= 0; i<= numStudents; i++)
		{
			System.out.println("What's the grade?");
			grade = Integer.parseInt(scan.nextLine());
			
			if(grade >= 80 && grade <=100){
			System.out.println("The grade is A");
			}
			else if (grade >= 70 && grade <=79)
		    {
			System.out.println("The grade is B");
			}
			else if (grade >= 60 && grade <=69)
		    {
			System.out.println("The grade is C");
			}
			else if (grade >= 50 && grade <=59)
		    {
			System.out.println("The grade is D");
			}
			else if (grade >= 0 && grade <=49)
		    {
			System.out.println("The grade is F");
			}
			else 
			System.out.println("The grade is X");
			
			
			
		}
		
		
	}

}
