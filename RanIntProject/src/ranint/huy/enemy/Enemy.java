package ranint.huy.enemy;

import ranint.linh.character.Character;

public class Enemy {
	private int ene_HP;
	private int ene_DEF;
	private int ene_ATT;
	private String enemyName;
	private String infor;
	
	public Enemy(String enemyName,String infor,int ene_HP, int ene_DEF, int ene_ATT) {
		this.ene_HP = ene_HP;
		this.ene_DEF = ene_DEF;
		this.ene_ATT = ene_ATT;
		this.enemyName= enemyName;
		this.infor=infor;
	}
	
	public Enemy(int ene_HP, int ene_DEF) {
		this.ene_HP = ene_HP;
		this.ene_DEF = ene_DEF;
	}
	
	public String getEnemyName() {
		return enemyName;
	}

	public String getInfor() {
		return infor;
	}

	public Enemy(int ene_HP) {
		this.ene_HP = ene_HP;
	}
	
	public int getEne_HP() {
		return ene_HP;
	}
	public int getEne_DEF() {
		return ene_DEF;
	}
	public int getEne_ATT() {
		return ene_ATT;
	}
	
	public void setEne_HP(int ene_HP) {
		this.ene_HP = ene_HP;
	}
	public void setEne_DEF(int ene_DEF) {
		this.ene_DEF = ene_DEF;
	}
	public void setEne_ATT(int ene_ATT) {
		this.ene_ATT = ene_ATT;
	}

	public void showEne_Stat() {
		System.out.println("Enemy's stat:");
		System.out.println("HP: " + this.getEne_HP() + "/1000");
		System.out.println("ATT: " + this.getEne_ATT() + "/1000");
		System.out.println("DEF: " + this.getEne_DEF() + "/500");
	}
	public void getDamage(int ATT) {
		int lose_DEF = ene_DEF - ATT;
		if (lose_DEF <0) {
			ene_HP += (lose_DEF);
		}
		this.setEne_HP(ene_HP);
	}
	
	public void normalATT(Character character) {
		character.getDamage(this.getEne_ATT());
	}
	
	public void normalATT_specialDefend(Character character) {
		character.useSpecialSkill(this);
	}
}