package khan;
/* Raeid Khan
 * List of Names in a array
 * Asks for amount of names then prints it from first to last then last to first
 * April 27, 2016
 */

import java.util.Scanner;

public class ListOfNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("How many names?");
		
		//input
		int num = Integer.parseInt(scan.nextLine());
		String names [] = new String[num]; 
		System.out.println("Write the names.");
		
		//output and processing 
		for (int i = 0; i<num; i++){
			names[i] = scan.nextLine();
		}
		for (int i=0; i<num; i++){
		System.out.println(names[i]);
		}
		for (int i = num - 1; i >= 0; i--){ 
			System.out.println(names[i]);
		}
				
			
	}

}
