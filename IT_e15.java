package game;

public class IT_e15 extends Character{
	private int limited_time = 5;
	void useSpecialSkill(Enermy enermy) {
		// decrease damage for 300
		if (limited_time > 0) {
			int damage = enermy.getEne_ATT() - 300;
			this.getDamage(damage);
			enermy.GetDamage(this.ATT);
		}
		else {
			System.out.println("You can't use this skill anymore!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
