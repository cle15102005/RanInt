package game;

public class Buff {

	private String buffName;
	private int bonusATT;
	private int bonusDEF;
	private int bonusHP;
	
	void getName() {
		System.out.println(buffName);
	}
	
	void getBonusATT() {
		System.out.println(bonusATT);
	}
	
	void getBonusDEF() {
		System.out.println(bonusDEF);
	}
	
	void getBonusHP() {
		System.out.println(bonusHP);
	}
	
	// bonus = 0 if no bonus
	public Buff(String buffName, int bonusATT, int bonusDEF, int bonusHP) {
		this.buffName = buffName;
		this.bonusATT = bonusATT;
		this.bonusDEF = bonusDEF;
		this.bonusHP = bonusHP;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
