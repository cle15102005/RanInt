package ranint.cuong.item;

public class Item {
	String name;
	String info;
	int bonusATT;
	int bonusHP;
	int bonusDEF;
	double prize;
	
	public String getName() {
		return name;
	}
	public int getBonusATT() {
		return bonusATT;
	}
	public int getBonusHP() {
		return bonusHP;
	}
	public int getBonusDEF() {
		return bonusDEF;
	}
	public String getInfo() {
		return info;
	}
	public double getPrize() {
		return prize;
	}

	public Item(String name, String info, int bonusATT, int bonusHP, int bonusDEF) {
		super();
		this.name = name;
		this.info = info;
		this.bonusATT = bonusATT;
		this.bonusHP = bonusHP;
		this.bonusDEF = bonusDEF;
	}
	public Item(String name, String info, int bonusATT) {
		super();
		this.name = name;
		this.info = info;
		this.bonusATT = bonusATT;
	}
	public Item(String name, String info, int bonusHP, int bonusDEF) {
		super();
		this.name = name;
		this.info = info;
		this.bonusHP = bonusHP;
		this.bonusDEF = bonusDEF;
	}
	
	public Item(String name, String info, int bonusATT, int bonusHP, int bonusDEF, double prize) {
		super();
		this.name = name;
		this.info = info;
		this.bonusATT = bonusATT;
		this.bonusHP = bonusHP;
		this.bonusDEF = bonusDEF;
		this.prize= prize;
		
	}
}
