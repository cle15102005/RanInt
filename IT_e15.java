package RanIntProject.src.ranint.linh.character;

import RanIntProject.src.ranint.huy.enemy.Enemy;

public class IT_e15 extends Character{
	private int limited_time = 3;
	public void useSpecialSkill(Enemy enemy) {
		// defend - decrease damage for 300
		if (limited_time > 0) {
			int damage = enemy.getEne_ATT() - 300;
			this.getDamage(damage);
			//enemy.getDamage(this.ATT);
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
		this.limited_time += limited_time;
	}
}