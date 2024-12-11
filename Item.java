package game;

public class Item {
	private String Name;
	private int bonusATT;
	private int bonusDEF;
	private int bonusHP;

	public int getBonusATT() {
		return bonusATT;
	}

	public int getBonusDEF() {
		return bonusDEF;
	}

	public int getBonusHP() {
		return bonusHP;
	}

	public Item(String name, int bonusATT, int bonusDEF, int bonusHP) {
		super();
		Name = name;
		this.bonusATT = bonusATT;
		this.bonusDEF = bonusDEF;
		this.bonusHP = bonusHP;
	}

	public void setBonusATT(int bonusATT) {
		this.bonusATT = bonusATT;
	}

	public void setBonusDEF(int bonusDEF) {
		this.bonusDEF = bonusDEF;
	}

	public void setBonusHP(int bonusHP) {
		this.bonusHP = bonusHP;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
}
