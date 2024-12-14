package ranint.linh.character;

import ranint.huy.enemy.Enemy;

public class IT_e10 extends Character {
	private int limited_time = 5;
	void useSpecialSkill(Enemy enemy) {
		// ATT + 300 temporary
		if (limited_time > 0) {
			this.getDamage(enemy.getEne_ATT());
			enemy.getDamage(this.ATT + 300);
		}
		else {
			System.out.println("You can't use this skill anymore!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}