package RanIntProject.src.ranint.linh.character;

import RanIntProject.src.ranint.huy.enemy.Enemy;

public class IT_e10 extends Character {
	private int limited_time = 3;
	public void useSpecialSkill(Enemy enemy) {
		// ATT + 300 temporary
		if (limited_time > 0) {
			//this.getDamage(enemy.getEne_ATT());
			enemy.getDamage(this.ATT + 300);
			limited_time -= 1;
		}
		else {
			System.out.println("You can't use this skill anymore!");
		}
	}
	public int getLimited_time() {
		return limited_time;
	}
	public void setLimited_time(int limited_time) {
		this.limited_time =+ limited_time;
	}
}