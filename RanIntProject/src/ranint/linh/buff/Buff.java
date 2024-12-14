package ranint.linh.buff;

import ranint.linh.character.Character;

public class Buff {

	private String buffName;
	private String information;
	private int bonusATT;
	private int bonusDEF;
	private int bonusHP;
	
	public String getInfomation() {
		return information;
	}
	public String getBuffName() {
		return buffName;
	}
	public int getBonusATT() {
		return bonusATT;
	}
	public int getBonusDEF() {
		return bonusDEF;
	}
	public int getBonusHP() {
		return bonusHP;
	}

	public void setBuffName(String buffName) {
		this.buffName = buffName;
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

	// bonus = 0 if no bonus
	public Buff(String buffName, String information, int bonusATT, int bonusDEF, int bonusHP) {
		this.buffName = buffName;
		this.information = information;
		this.bonusATT = bonusATT;
		this.bonusDEF = bonusDEF;
		this.bonusHP = bonusHP;
	}
    
	public void activeBuff(Buff buff, Character character) {
		character.setATT(buff.getBonusATT());
		character.setDEF(buff.getBonusDEF());
		character.setHP(buff.getBonusHP());
		System.out.println(buff.getInfomation());
	}
}