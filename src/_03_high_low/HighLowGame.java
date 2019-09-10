//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100) + 1;

		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 11; i++) {

			// 1. Ask the user for a guess using a pop-up window, and save their response
			String guse = JOptionPane.showInputDialog("guess number");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int number = Integer.parseInt(guse);
			// 5. if the guess is correct
			if (number == random) {

				// 6. Win
				JOptionPane.showMessageDialog(null, "you win");
				i=11;
			}
			
			// 7. if the guess is high
			else if (random < number) {
				JOptionPane.showMessageDialog(null, "your guess it's too high");
			}
			// 8. Tell them it's too high
			else if (random>number ) {
				JOptionPane.showMessageDialog(null, "guess is too low");
			}
			// 9. if the guess is low
			// 10. Tell them it's too low

			// 12. Tell them they lose
			if (i==10) {
				JOptionPane.showMessageDialog(null, "you lose");
						
			}
		
		}
	}

}
