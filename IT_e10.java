package game;

public class IT_e10 extends Character {
	private int limited_time = 5;
	void useSpecialSkill(Enermy enermy) {
		// ATT + 300 temporary
		if (limited_time > 0) {
			this.getDamage(enermy.getEne_ATT());
			enermy.GetDamage(this.ATT + 300);
		}
		else {
			System.out.println("You can't use this skill anymore!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
