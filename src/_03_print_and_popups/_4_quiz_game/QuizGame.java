package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String input = JOptionPane.showInputDialog("What is 1+1");
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				if (input.equals("2")) {
					score ++;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				String input3 = JOptionPane.showInputDialog("What is 346 * 1000");
				if (input3.equals("346000")) {
					score ++;
				}
				
				String input4 = JOptionPane.showInputDialog("What is 125 * 8");
				if (input4.equals("1000")) {
					score ++;
				}
				
				String input5 = JOptionPane.showInputDialog("What is 2 * 3 * 4 * 5");
				if (input5.equals("120")) {
					score ++;
				}
				
				String input7 = JOptionPane.showInputDialog("What is 1020304050607080 + 600521000 * 567430204 * 24973870943763 * 0");
				if (input7.equals("0")) {
					score ++;
				}
		// After all the questions have been asked, tell the user their final score 
				JOptionPane.showMessageDialog(null, score + "/ 5");
	}
}
