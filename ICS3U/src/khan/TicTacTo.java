package khan;
/*Raeid Khan
 * Tic Tac To
 * Program asks user by coordinates to place their choices of x and o in a game of tic tac to
 * May 20, 2016
 */

import java.util.Scanner;

public class TicTacTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		//Array for placement of x and o
		char [] [] xO = { {' ',' ',' '}, {' ',' ', ' '}, {' ', ' ', ' ' }};
		//Variables
		int row;
		int column;
		String playAgain = "y";
		boolean gameOver = false;
		System.out.print("Let's play tic tac toe.");

		while(playAgain.equalsIgnoreCase("y")){
			//Output and processing
			while(gameOver != true){
				//Gets first user's choice of placement for x
				System.out.println("Where user 1 wants to put x. Type row then column.");
				row = Integer.parseInt(scan.nextLine());
				column = Integer.parseInt(scan.nextLine());
				xO[row - 1][column - 1] = 'x';
				//Displays choice of placement on the board
				System.out.println(xO[0][0] + " " + xO[0][1] + " " + xO[0][2] );
				System.out.println(xO[1][0] + " " + xO[1][1] + " " + xO[1][2] );
				System.out.println(xO[2][0] + " " + xO[2][1] + " " + xO[2][2] );

				//check winner for x
				if(xO[0][0] != ' ' && xO[0][0] == xO[0][1] && xO[0][1] == xO[0][2] ){ //row 1
					gameOver = true;
					System.out.println("Game done.");
					System.out.println(xO[0][0] + " won");
				}    
				else if(xO[1][0] != ' ' && xO[1][0] == xO[1][1] && xO[1][1] == xO[1][2] ){ //row 2
					gameOver = true;
					System.out.println("Game done.");
					System.out.println(xO[1][0] + " won");
				}
				else if(xO[2][0] != ' ' && xO[2][0] == xO[2][1] && xO[2][1] == xO[2][2] ){ //row 3
					gameOver = true;
					System.out.println("Game done.");
					System.out.println(xO[2][0] + " won");
				}
				else if(xO[0][0] != ' ' && xO[0][0] == xO[1][0] && xO[1][0] == xO[2][0] ){ //column 1
					gameOver = true;
					System.out.println("Game done.");
					System.out.println(xO[0][0] + " won");
				}
				else if(xO[0][1] != ' ' && xO[0][1] == xO[1][1] && xO[1][1] == xO[2][1] ){ //column 2
					gameOver = true;
					System.out.println("Game done.");
					System.out.println(xO[0][1] + " won");
				}
				else if(xO[0][2] != ' ' && xO[0][2] == xO[1][2] && xO[1][2] == xO[2][2] ){ //column 3
					gameOver = true;
					System.out.println("Game done.");
					System.out.println(xO[0][2] + " won");
				}
				else if(xO[0][0] != ' ' && xO[0][0] == xO[1][1] && xO[1][1] == xO[2][2] ){ //Diagonal 1
					gameOver = true;
					System.out.println("Game done.");
					System.out.println(xO[0][0] + " won");
				}
				else if(xO[0][2] != ' ' && xO[0][2] == xO[1][1] && xO[1][1] == xO[2][0] ){ //Diagonal 2
					gameOver = true;
					System.out.println("Game done.");
					System.out.println(xO[0][2] + " won");
				}

				if(gameOver != true){
					//Gets second user's choice of placement for o
					System.out.println("Where user 2 wants to put o. Type row then column.");
					row = Integer.parseInt(scan.nextLine());
					column = Integer.parseInt(scan.nextLine());
					xO[row - 1][column - 1] = 'o';
					//Displays user's choice of o
					System.out.println(xO[0][0] + " " + xO[0][1] + " " + xO[0][2] );
					System.out.println(xO[1][0] + " " + xO[1][1] + " " + xO[1][2] );
					System.out.println(xO[2][0] + " " + xO[2][1] + " " + xO[2][2] );

					//check winner for o
					if(xO[0][0] != ' ' && xO[0][0] == xO[0][1] && xO[0][1] == xO[0][2] ){ //row 1
						gameOver = true;
						System.out.println("Game done.");
						System.out.println(xO[0][0] + " won");
					}    
					else if(xO[1][0] != ' ' && xO[1][0] == xO[1][1] && xO[1][1] == xO[1][2] ){ //row 2
						gameOver = true;
						System.out.println("Game done.");
						System.out.println(xO[1][0] + " won");
					}
					else if(xO[2][0] != ' ' && xO[2][0] == xO[2][1] && xO[2][1] == xO[2][2] ){ //row 3
						gameOver = true;
						System.out.println("Game done.");
						System.out.println(xO[2][0] + " won");
					}
					else if(xO[0][0] != ' ' && xO[0][0] == xO[1][0] && xO[1][0] == xO[2][0] ){ //column 1
						gameOver = true;
						System.out.println("Game done.");
						System.out.println(xO[0][0] + " won");
					}
					else if(xO[0][1] != ' ' && xO[0][1] == xO[1][1] && xO[1][1] == xO[2][1] ){ //column 2
						gameOver = true;
						System.out.println("Game done.");
						System.out.println(xO[0][1] + " won");
					}
					else if(xO[0][2] != ' ' && xO[0][2] == xO[1][2] && xO[1][2] == xO[2][2] ){ //column 3
						gameOver = true;
						System.out.println("Game done.");
						System.out.println(xO[0][2] + " won");
					}
					else if(xO[0][0] != ' ' && xO[0][0] == xO[1][1] && xO[1][1] == xO[2][2] ){ //Diagonal 1
						gameOver = true;
						System.out.println("Game done.");
						System.out.println(xO[0][0] + " won");
					}
					else if(xO[0][2] != ' ' && xO[0][2] == xO[1][1] && xO[1][1] == xO[2][0] ){ //Diagonal 2
						gameOver = true;
						System.out.println("Game done.");
						System.out.println(xO[0][2] + " won");
					}
				}
			}
			//Asks user if they want to play again
			System.out.println("Play again?(y/n)");
			playAgain = scan.nextLine();
			//Clears board if user agrees to play again
			if(playAgain.equalsIgnoreCase("y")){
				gameOver = false;
				xO[0][0] = ' ';
				xO[0][1] = ' ';
				xO[0][2] = ' ';
				xO[1][0] = ' ';
				xO[1][1] = ' ';
				xO[1][2] = ' ';
				xO[2][0] = ' ';
				xO[2][1] = ' ';
				xO[2][2] = ' ';
			}
		}
	}
}