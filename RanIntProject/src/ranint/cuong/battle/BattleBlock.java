package ranint.cuong.battle;

import ranint.huy.enemy.Enemy;
import ranint.linh.character.Character;

public class BattleBlock {
	public void norBattle(Character character, Enemy enemy) {
		boolean endGame= false;
		System.out.printf("Suddenly, you encounter: %s\n", enemy.getEnemyName());
		while(!endGame) {
			character.normalATT(enemy);
			enemy.normalATT();
			if(enemy.getEne_HP()<=0 || character.getHP()<=0){
				endGame= true;
			}
		}
		System.out.println("Game ended");
	}
	
	//public void bosBattle(Character character, Boss boss) {
	//	System.out.printf("Suddenly, you encounter: %s", boss.getEnemyName());
	//}
}
