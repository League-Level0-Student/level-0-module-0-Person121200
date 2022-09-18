package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		
			// playerHealth to store your health - set it equal to 100
	int playerHP = 100;
			// dragonHealth to store the dragon's health - set it equal to 100
	int dragonHP = 100;
		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
	
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
	int playerAtt = 0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.
	int dragonAtt = 0;
		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON
			String Input = JOptionPane.showInputDialog(" Do you want to attack dragon with a yell or a kick");
				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
	
				// 4. If they typed in "yell":
			if (Input.equals ("yell")) {
				playerAtt = ran.nextInt(10); 
			}
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
					  // ran.nextInt(10)
			
				// 5. If they typed in "kick":
			if (Input.equals("kick")) {
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
			playerAtt = ran.nextInt(30); 
			}
				// 6. Subtract the player attack value from the dragon's health
			// THE DRAGON RETALIATES
			dragonHP -= playerAtt;
				// 7. Find a random number between 0 and 35 and store it in dragonAttack
			dragonAtt = ran.nextInt(100); 
				// 8. Subtract the dragon attack value from the player's health
			playerHP -= dragonAtt;
			// ASSESS THE DAMAGE
			
				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method\
			if (playerHP <=0)
			playerLost();
			
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method
			if (dragonHP <=0)
				dragonLost();
			
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.
			JOptionPane.showMessageDialog(null, "The dragon has:" + dragonHP);
			JOptionPane.showMessageDialog(null, " You have" + playerHP);
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
	JOptionPane.showMessageDialog(null, "You have been defeated by the dragon, why didn't you kick him the whole time instead of yelling");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		JOptionPane.showMessageDialog(null, "You have defeated the dragon and took its treasure");
		System.exit(0);   //This code ends the program
	}

}
