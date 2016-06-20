/*
 * 
 *Rock Paper Scissors
 *Program makes user verse computer in rock, paper, scissors. 
 * Raeid Khan
 * June 17, 2016
 */
package khan;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import hsa_new.Console; 
import java.awt.*;   

public class RockPaperScissors {

	public static void main(String[] args) {

		Console c = new Console();

		//All images
		Image rock = Toolkit.getDefaultToolkit().getImage("rock.jpg");
		Image scissors = Toolkit.getDefaultToolkit().getImage("scissors.jpg");
		Image paper = Toolkit.getDefaultToolkit().getImage("paper.jpg");
		Image loadingBar = Toolkit.getDefaultToolkit().getImage("loadingbar.jpg");
		Image redBar = Toolkit.getDefaultToolkit().getImage("redbar.jpg");
		Image rps2 = Toolkit.getDefaultToolkit().getImage("rps2.jpg");
		Image square = Toolkit.getDefaultToolkit().getImage("square.jpg");
		Image vs = Toolkit.getDefaultToolkit().getImage("vs.jpg");
		Image user = Toolkit.getDefaultToolkit().getImage("user.jpg");
		Image cpu = Toolkit.getDefaultToolkit().getImage("cpu.jpg");
		Image youLose = Toolkit.getDefaultToolkit().getImage("youlose.jpg");
		Image youWin = Toolkit.getDefaultToolkit().getImage("youwin.jpg");
		Image back1 = Toolkit.getDefaultToolkit().getImage("back1.jpg");
		Image back3 = Toolkit.getDefaultToolkit().getImage("back3.jpg");
		Image back4 = Toolkit.getDefaultToolkit().getImage("back4.jpg");
		Image gameOver = Toolkit.getDefaultToolkit().getImage("gameover.jpg");

		//All sounds
		Clip crowdCheer = null;
		Clip crowdBoo = null;
		try {
			crowdCheer = AudioSystem.getClip();
			crowdCheer.open(AudioSystem.getAudioInputStream(new File("crowdcheer.wav")));

			crowdBoo = AudioSystem.getClip();
			crowdBoo.open(AudioSystem.getAudioInputStream(new File("crowdBoo.wav")));

		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
			e1.printStackTrace();
		}


		String [] rps = new String [] { "rock", "paper", "scissors"};//Array for rock paper and scissors

		//All variables
		int scoreUser = 0;
		int scoreCPU = 0;
		int randomNum;
		String answer;
		int score = 0;
		boolean playAgain = true;
		boolean resetScore = false;

		//Pics load before program starts
		while(!(Toolkit.getDefaultToolkit().prepareImage(rps2, 40, 40, null)));
		while(!(Toolkit.getDefaultToolkit().prepareImage(loadingBar, 10, 10, null)));
		while(!(Toolkit.getDefaultToolkit().prepareImage(redBar, 10, 10, null)));

		c.drawImage(rps2, 180, 100, 300, 300, null);
		c.drawImage(loadingBar, 140, 400, 420, 100, null);

		//Pics load as it gets shown on a loading bar
		timer2();
		while(!(Toolkit.getDefaultToolkit().prepareImage(gameOver, 40, 40, null)));
		while(!(Toolkit.getDefaultToolkit().prepareImage(rock, 10, 10, null)));
		while(!(Toolkit.getDefaultToolkit().prepareImage(paper, 40, 40, null)));
		c.drawImage(redBar, 150, 425, 100, 45, null);

		while(!(Toolkit.getDefaultToolkit().prepareImage(back4, 40, 40, null)));
		while(!(Toolkit.getDefaultToolkit().prepareImage(scissors, 40, 40, null)));
		while(!(Toolkit.getDefaultToolkit().prepareImage(square, 40, 40, null)));
		timer2();
		c.drawImage(redBar, 250, 425, 100, 45, null);

		while(!(Toolkit.getDefaultToolkit().prepareImage(back1, 40, 40, null)));
		while(!(Toolkit.getDefaultToolkit().prepareImage(back3, 40, 40, null)));
		while(!(Toolkit.getDefaultToolkit().prepareImage(vs, 40, 40, null)));
		while(!(Toolkit.getDefaultToolkit().prepareImage(user, 40, 40, null)));
		timer2();
		c.drawImage(redBar, 350, 425, 100, 45, null);

		while(!(Toolkit.getDefaultToolkit().prepareImage(youWin, 40, 40, null)));
		while(!(Toolkit.getDefaultToolkit().prepareImage(cpu, 40, 40, null)));
		while(!(Toolkit.getDefaultToolkit().prepareImage(youLose, 40, 40, null)));
		timer2();
		c.drawImage(redBar, 450, 425, 100, 45, null);
		timer();
		c.clear();

		c.drawImage(back1, 1, 1, 640, 500, null );
		intro(c);
		c.setCursor(10, 12);
		answer = c.readLine();

		if(answer.equalsIgnoreCase("y")){
			while(playAgain==true){
				c.clear();

				do{
					try{
						c.drawString("What score would you like to play until. Choose from 1 to 5", 100, 100);
						c.setCursor(10, 10);
						score = Integer.parseInt(c.readLine());
						if(score<=0 || score>=6){
							c.drawString("Invalid input try again.", 50, 70);
						}

					}catch(Exception e){
						//e.printStackTrace();
						c.drawString("Invalid input try again.", 50, 70);
						score = -1;
					}
				}while(score<=0 || score>=6);

				if(resetScore == true){
					scoreUser = 0;
					scoreCPU = 0;
				}
				c.clear();
				do{
					c.clear();
					//Display the design of the game
					c.drawImage(back3, 1, 1, 640, 500, null );
					c.drawImage(square, 90, 120, 170, 170, null);
					c.drawImage(square, 390, 120, 170, 170, null);
					c.drawImage(user, 120, 65, 100, 65, null);
					c.drawImage(cpu, 420, 65, 100, 65, null);
					c.drawImage(vs, 260, 120, 130, 130, null);
					c.drawString(""+scoreCPU, 500, 340 );
					c.drawString(""+scoreUser, 200, 340 );

					randomNum = (int)(Math.random() * rps.length);//Cpu chooses random number that is their selection of rock paper scissors

					//score board
					c.drawString("User score: ", 100, 340);
					c.drawString("Computer score: ", 400, 340);
					do{

						//All if statements for scenarios
						c.drawString("Select rock, paper, or scissors.(1/2/3)", 230, 110);
						c.setCursor(20, 12);
						answer = c.readLine();
						if(answer.equalsIgnoreCase("1") || (answer.equalsIgnoreCase("2") || (answer.equalsIgnoreCase("3")))){

							//User rock
							if(answer.equalsIgnoreCase("1") && randomNum==0){
								c.drawString("It was a tie ", 100, 400);
								c.drawImage(rock, 100, 130, 140, 140, null);
								c.drawImage(rock, 400, 130, 140, 140, null);
							}
							else if(answer.equalsIgnoreCase("1") && randomNum==1){
								c.drawString("You lose ", 100, 400);
								scoreCPU++;
								c.drawImage(rock, 100, 130, 140, 140, null);
								c.drawImage(paper, 400, 130, 140, 140, null);
							}
							else if(answer.equalsIgnoreCase("1") && randomNum==2){
								c.drawString("You win ", 100, 400);
								scoreUser++;
								c.drawImage(rock, 100, 130, 140, 140, null);
								c.drawImage(scissors, 400, 130, 140, 140, null);
							}
							//user paper
							else if(answer.equalsIgnoreCase("2") && randomNum==0){
								c.drawString("You win", 100, 400);
								scoreUser++;  
								c.drawImage(paper, 100, 130, 140, 140, null);
								c.drawImage(rock, 400, 130, 140, 140, null);
							}
							else if(answer.equalsIgnoreCase("2") && randomNum==1){
								c.drawString("It was a tie ", 100, 400);
								c.drawImage(paper, 100, 130, 140, 140, null);
								c.drawImage(paper, 400, 130, 140, 140, null);
							}
							else if(answer.equalsIgnoreCase("2") && randomNum==2){
								c.drawString("You lose ", 100, 400);
								scoreCPU++;
								c.drawImage(paper, 100, 130, 140, 140, null);
								c.drawImage(scissors, 400, 130, 140, 140, null);
							}
							//user scissors 
							else if(answer.equalsIgnoreCase("3") && randomNum==0){
								c.drawString("You lose ", 100, 400);
								scoreCPU++;
								c.drawImage(scissors, 100, 130, 140, 140, null);
								c.drawImage(rock, 400, 130, 140, 140, null);
							}
							else if(answer.equalsIgnoreCase("3") && randomNum==1){
								c.drawString("You win ", 100, 400);
								scoreUser++;
								c.drawImage(scissors, 100, 130, 140, 140, null);
								c.drawImage(paper, 400, 130, 140, 140, null);
							}
							else if(answer.equalsIgnoreCase("3") && randomNum==2){
								c.drawString("It was a tie ", 100, 400);
								c.drawImage(scissors, 100, 130, 140, 140, null);
								c.drawImage(scissors, 400, 130, 140, 140, null);

							}					
						}
						else{
							c.drawString("Invalid input try again.", 255, 90);
						}
					}
					while(!answer.equalsIgnoreCase("1") && !answer.equalsIgnoreCase("2") && !answer.equalsIgnoreCase("3"));
					timer();


				}while((scoreUser != score) && (scoreCPU != score));

				c.clear();
				//Display design of the game
				c.drawImage(back3, 1, 1, 640, 500, null );
				c.drawImage(square, 90, 120, 170, 170, null);
				c.drawImage(square, 390, 120, 170, 170, null);
				c.drawImage(user, 120, 65, 100, 65, null);
				c.drawImage(cpu, 420, 65, 100, 65, null);
				c.drawImage(vs, 260, 120, 130, 130, null);
				c.drawString("User score: ", 100, 340);
				c.drawString("Computer score: ", 400, 340);
				c.drawString(""+scoreCPU, 500, 340 );
				c.drawString(""+scoreUser, 200, 340 );
				timer();
				c.clear();

				//Display design for when you win
				c.drawImage(back4, 1, 1, 640, 500, null );
				if(scoreUser == score){
					c.drawImage(youWin, 90, 120, 500, 200, null);
				//Display desgin for when you lose
				}
				else if(scoreCPU == score){
					c.drawImage(youLose, 90, 120, 500, 200, null);
					
				}
				timer();
				c.clear();
				do{
					//End game messages and if statements for scenarios
					c.drawString("Do you want to play again? Or stop.(Y/S)", 50, 70 );
					answer = c.readLine();
					if (answer.equalsIgnoreCase("y") || (answer.equalsIgnoreCase("S"))){


						if(answer.equalsIgnoreCase("y")){
							playAgain = true;
							resetScore = true;		
						}
						else if(answer.equalsIgnoreCase("S")){
							playAgain = false;
							c.clear();
							c.drawImage(gameOver, 90, 120, 500, 200, null);
						}
					}
					else{
						c.drawString("Invalid input try again.", 50, 90);
					}

				}while(!answer.equalsIgnoreCase("y") && (!answer.equalsIgnoreCase("S")));

			}
		}
		else{
			//Display message and pic if user didn't want to play
			c.clear();
			c.print("Wow ok.");
			c.drawImage(gameOver, 90, 120, 500, 200, null);
		}

	}
	public static void intro(Console c){
		/**
		 * Intro messages for the begining of the program
		 */
		c.drawString("WELCOME TO ROCK PAPER SCISSORS. You are facing a cpu in Rock, Paper, Scissors.",100 ,100 );
		c.drawString("Rules are simple. When it's your turn, simply enter 1,2, or 3.", 100, 120);
		c.drawString("1 is Rock, 2 is Paper, and 3 is Scissors ",100 ,140 );
		c.drawString("Enter y if you wish to play, enter anything else if not. ", 100 , 160 );
	}

	public static void timer(){
		/**
		 * Timer for 2 seconds
		 */
		try{
			Thread.sleep(2000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	public static void timer2(){
		/**
		 * Timer for 0.2 seconds
		 */
		try{
			Thread.sleep(200);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}


