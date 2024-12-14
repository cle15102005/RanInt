package ranint.linh.character;

import ranint.huy.enemy.Enemy;

public class IT_e15 extends Character{
	private int limited_time = 5;
	void useSpecialSkill(Enemy enemy) {
		// decrease damage for 300
		if (limited_time > 0) {
			int damage = enemy.getEne_ATT() - 300;
			this.getDamage(damage);
			enemy.getDamage(this.ATT);
		}
		else {
			System.out.println("You can't use this skill anymore!");
		}
	}
}