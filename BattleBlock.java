package RanIntProject.src.ranint.cuong.battle;

import RanIntProject.src.ranint.huy.enemy.Enemy;
import RanIntProject.src.ranint.linh.character.Character;
import RanIntProject.src.ranint.linh.character.IT_e10;
import RanIntProject.src.ranint.linh.character.IT_e15;

import java.util.Scanner;

public class BattleBlock {
	public void delay(int time) {

		System.out.println(".");
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // delay 0.5 seconds
		System.out.println(".");
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // delay 0.5 seconds
		System.out.println(".");
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // delay 0.5 seconds
	}
	
	
	public void norBattle(Character character, Enemy enemy)  {
		boolean endGame= false;
		Scanner input = new Scanner(System.in);
		System.out.printf("Suddenly, you encounter: %s\n", enemy.getInfor());
		while(!endGame) {
			// if char is an IT_e10
			if (character instanceof IT_e10) {
				// now char e10's turn
				System.out.println("(+) Your turn!");
				System.out.println("Do you want to use your \"ITe10\" special skill? (\"Y\" or \"N\")"
						+ "\nYou have " + ((IT_e10) character).getLimited_time() + " times more "
						+ "and if you fail to use this skill, you will lose your turn!");
				String choice = input.nextLine();
				// if chose to use skill
				if (choice.equals("Y")) {
					if (((IT_e10) character).getLimited_time() > 0) {
						System.out.println("Successful use your special skill to attack " + enemy.getInfor());
						character.useSpecialSkill(enemy);
						delay(500);
					}
					else {
						System.out.println("Fail to use. You lose your turn!");
					}
				}
				// chose not to use skill, normal attack
				else {
					System.out.println("You attack " + enemy.getInfor() + "!");
					character.normalATT(enemy);
					delay(500);
				}
				
				// now enemy's turn
				if (enemy.getEne_HP() > 0) {
					System.out.println("(+) Now, " + enemy.getInfor() + "'s turn!");
					System.out.println(enemy.getInfor() + " attack you!");
					enemy.normalATT(character);
					delay(500);
				}
			}
			
			//else character is instance of IT_e15
			else {
				// 1st, char's turn
				System.out.println("(+) Your turn!");
				System.out.println("You attack " + enemy.getInfor() + "!");
				character.normalATT(enemy);
				delay(500);
				
				// now turn of enemy
				if (enemy.getEne_HP() > 0) {
					System.out.println("(+) Now, " + enemy.getInfor() + "'s turn!");
					System.out.println("Do you want to use your \"ITe15\" special defend skill? (\"Y\" or \"N\")"
							+ "\nYou have " + ((IT_e15) character).getLimited_time() + " times more "
							+ "and if you fail to use this skill, you will lose your turn!");
					String choice = input.nextLine();
					// special defend
					if (choice.equals("Y")) {
						if (((IT_e15) character).getLimited_time() > 0) {
							System.out.println(enemy.getInfor() + " attack you!");
							enemy.normalATT_specialDefend(character);
							delay(500);
							if (character.getHP() > 0) {
								System.out.println("You are successful using your special skill to defend "
										+ enemy.getInfor() + "'s attack! \n🎉🎉🎉");
								try {
									Thread.sleep(800);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}
						// out of times
						else {
							System.out.println("Fail to use, " + enemy.getInfor() + " attack you now!");
							enemy.normalATT(character);
							delay(500);
						}
					}
					// without special defend skill
					else {
						System.out.println(enemy.getInfor() + " attack you!");
						enemy.normalATT(character);
						delay(500);
					}
				}
			}
			
			// end game
			if(enemy.getEne_HP() <=0) {
				System.out.println(enemy.getInfor() + " die!");
				endGame = true;
			}
			else if (character.getHP() <= 0){
				System.out.println("BOOMMM...GAME OVER!");
				endGame = true;
			}
		}
		//System.out.println("Game ended");
	}
	
	//public void bosBattle(Character character, Boss boss) {
	//	System.out.printf("Suddenly, you encounter: %s", boss.getEnemyName());
	//}
}
