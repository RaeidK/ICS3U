package khan;
/*Raeid Khan
 * Dice rolling array program
 * Program rolls 2 dices 10000 times and displays the total and how many times the total happened
 * April 29, 2016
 */

import java.util.Scanner;

public class RollingDice {

	public static void main(String[] args) {
		
		//Declaring Variables
		int dice1;
		int dice2;
		int d;
		
		//Array
		String[] diceRoll = new String [] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		
		int [] diceTotal = new int[11];
		
		//Loop and number of rolls up to 10000
		for(int i = 0; i <= 9999; i++){
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		d = dice1 + dice2;
		
		
		 if (d == 2){
			 diceTotal[0]++;
		 }
		 else if (d==3){
			 diceTotal[1]++;
		 }
		 else if (d==4){
			 diceTotal[2]++;
		 }
		 else if (d==5){
			 diceTotal[3]++;
		 }
		 else if (d==6){
			 diceTotal[4]++;
		 }
		 else if (d==7){
			 diceTotal[5]++;
		 }
		 else if (d==8){
			 diceTotal[6]++;
		 }
		 else if (d==9){
			 diceTotal[7]++;
		 }
		 else if (d==10){
			 diceTotal[8]++;
		 }
		 else if (d==11){
			 diceTotal[9]++;
		 }
		 else if (d==12){
			 diceTotal[10]++;
		 }
		
	}

		//Outputs
		 System.out.println("Total            " + "Number of times this happened");
		 System.out.println("2                " + diceTotal[0]++);
		 System.out.println("3                " + diceTotal[1]++);
		 System.out.println("4                " + diceTotal[2]++);
		 System.out.println("5                " + diceTotal[3]++);
		 System.out.println("6                " + diceTotal[4]++);
		 System.out.println("7                " + diceTotal[5]++);
		 System.out.println("8                " + diceTotal[6]++);
		 System.out.println("9                " + diceTotal[7]++);
		 System.out.println("10               " + diceTotal[8]++);
		 System.out.println("11               " + diceTotal[9]++);
		 System.out.println("12               " + diceTotal[10]++);
}
	
}
