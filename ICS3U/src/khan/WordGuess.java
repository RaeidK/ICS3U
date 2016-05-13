package khan;
/*Raeid Khan
 * Word guess program
 *A hangman game made in the program
 *May 13 2016
 */

import java.util.Scanner;

public class WordGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String realWord[] = new String[] {"superman", "hulk", "batman", "venom", "spiderman", "flash", "wolverine", "joker", "magneto", "doomsday"};

		//variables
		int randomName;
		int numGuess;
		String YN;
		String letterGuess = null;
		String wordGuess;
		
		boolean secretWord = false;	

		//Introduces program/ output
		System.out.println("Do you want to play hangman?");
		YN = scan.nextLine();
		if(YN .equalsIgnoreCase("Y")){
			System.out.println("The subject of the word is heros and villains of Marvel and DC.");

		}
		//Output and processing
		while(YN.equalsIgnoreCase("y")){
			randomName =(int) (Math.random()*realWord.length); 
			String word  = "";

			for(int i = 0; i < realWord[randomName].length(); i++){
				word = word + "-";
			}
			System.out.println(word);

			do{
				if(word.equals(realWord[randomName])){
					secretWord = true;
				}
				else if(!word.equals(realWord[randomName])){
					System.out.println("Guess a letter");
					letterGuess = scan.nextLine();
				}
				if(letterGuess.equals("!")){
					secretWord = true;
				}
				else{

					numGuess = realWord[randomName].indexOf(letterGuess);
					if (numGuess== -1){
						System.out.println("Wrong");
					}
					else{
						word = word.substring(0, numGuess) + letterGuess + word.substring ((numGuess+1), word.length()); 

						System.out.println(word);
					}
				}
			}


			while (!secretWord);

			if (letterGuess.equals("!")){
				System.out.println("Type the full word");
				wordGuess = scan.nextLine();
				if (wordGuess.equals(realWord[randomName])){
					System.out.println("You guessed the word! You win.");
				}
				else {
					System.out.println("Wrong! You lose.");
				}
			}
			else {
				System.out.println("You guessed the word! You win.");
			}

			//Asks to play again
			System.out.println("Do you want to play again?");
			YN = scan.nextLine();
		
		}
	}
}



