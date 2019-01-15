/*
Generate a random number between -100 and 1000 for the user to guess.
Display a prompt, or a line of text, asking the user to guess a number in that range.
Accept the user’s guess as input.
Compare the user’s guess to the computer’s number to see if the guess too high, low or correct.
Display the results on the screen.
Prompt the user to guess another number until they guess correctly.
Ask the user if they would like to play again.
Count the user’s tries to get the correct answer and display on win.
MadLibs Code
Upload to your GitHub

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

import java.awt.Font;
//import java.awt.event.*;

public class HighLow {
	
	public static void main (String[] args) {
		
		JFrame f = new JFrame("HighLow");
		JTextField tf = new JTextField();

		tf.setBounds(280, 160, 40, 20);
		
		JButton b = new JButton("Want to Guess Again?");
		
		b.setBounds(100, 200, 180, 50);
		
		JLabel j = new JLabel("HighLow");
		JLabel j2 = new JLabel("Guess A Number Between -100 to 1000:");
		
		j.setBounds(120, 40, 150, 100);
		j.setFont(new Font("", Font.BOLD, 30));
		
		j2.setBounds(50, 160, 240, 20);
		j2.setFont(new Font("", Font.PLAIN, 12));
		
		
		
		//Creating a random number 
		Random random = new Random();
		//Getting user input
		Scanner scanner = new Scanner(System.in);
				
		//Using random generator to pick a number between -100 to 1000
		int number = random.nextInt(1000);
		int guess = -100;
		//Counting user attempts
		int attempts = 0;
		
		
		
		

			 //Using while loop until user guesses right number
		    while (guess!=number) {
		          
		    	//Ask the user to guess number
		          
		         System.out.print("Guess a number between -100 to 1000: ");
		          
		         // Read the users guess
		          
		         guess = scanner.nextInt();
		         
		         attempts += 1;
		          
		         // Check if the guess is high, low or correct
		          
		         if (guess<number) {
		             
		            // if guess is too low
		             
		            System.out.println("Too low, please try again");
		             
		         } else if (guess>number) {
		 
		            // if guess is too high
		 
		            System.out.println("Too high, please try again");
		             
		         } else {
		             
		            // if guess is correct prints
		             
		            System.out.println("Correct, the number was " + number +"\n" + "You guessed " + attempts +" times!");
		        
		            scanner.close();
		         }
		         f.add(b);
		         f.add(tf);
		         f.add(j);
		         f.add(j2);
		         f.setSize(400,400);
		         f.setLayout(null);
		         f.setVisible(true);
		         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		         f.setLocationRelativeTo(null);
		         j.setOpaque(true);
		}
	}
	}
