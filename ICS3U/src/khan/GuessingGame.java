package khan;
/* Raeid Khan
 * Guessing Game
 * User picks a number from 1 to 20 in their head and the program tries to guess your number
 * May 4, 2016
 */

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//Array
		String guess [] = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}; 
		boolean[] repeat = new boolean[19];
		//Variables
		int randomNum;
		int numGuess = 0;
		String YN;
		//input 
		System.out.println("Hey, let's play a game. Choose a number from 1 to 20 and let me try to guess it. I have 15 chances to get it right.");
		System.out.println("If you want to play type "+"y "+"if not type "+"n.");
		YN = scan.nextLine();
		//Plays game if user decides to
		if(YN.equalsIgnoreCase("y")){
			//While loop for if user wants to play again
			while(YN.equalsIgnoreCase("Y")){
				numGuess = 0;
				//Loops until counter reaches 15 or the correct number gets chosen; output and processing
				for(int i = 0; i <=14; i++){
					numGuess++;
					System.out.println("number of guesses: "+ numGuess);//Prints the number of guesses every time an answer is typed
					randomNum =(int)(Math.random() * guess.length);
					//Checks if number that was randomized was checked
					while(repeat[randomNum]){
						randomNum =(int)(Math.random() * guess.length);
					}
					System.out.print("Is it "+ guess[randomNum]+"?(Y/N)");
					//Checks the number that has been randomized 
					repeat[randomNum] = true;
					YN = scan.nextLine();

					if(YN.equalsIgnoreCase("y") && numGuess!=15){

						System.out.print("I win, I guessed your number.");
						i=15;

					}

					else if(numGuess == 15 && !YN.equalsIgnoreCase("y")){
						System.out.println("I lose, I couldn't guess your number");
					}

				}

				System.out.println("Play again?(Y/N)");
				YN = scan.nextLine();
			}
		}
	}
}
