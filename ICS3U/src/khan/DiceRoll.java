package khan;
/*
 * User vs Cpu dice program
 * March 23 2016
 * Raeid Khan
 */
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//Variables
		int userRoll;
		int cpuRoll;

		userRoll = (int)(Math.random() * 5) + 1;
		cpuRoll = (int)(Math.random() * 5) + 1;


		//Output and Processing 
		if (userRoll > cpuRoll){
			System.out.println("User:" + userRoll + " " + "Cpu:" + cpuRoll );
			System.out.println("You beat the cpu");
		}
		else if (userRoll < cpuRoll){
			System.out.println("User:" + userRoll + " " + "Cpu: " + cpuRoll );
			System.out.println("Cpu beat you");
		}

		else if (userRoll == cpuRoll){
			System.out.println("User:" + userRoll + " " + "Cpu: " + cpuRoll );
			System.out.println("It was a tie");
			
		}
	}

}

