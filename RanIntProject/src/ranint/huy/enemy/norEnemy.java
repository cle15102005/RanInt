package ranint.huy.enemy;

import ranint.linh.character.Character;

public class norEnemy extends Enemy {
	public norEnemy(String enemyName,String infor,int ene_HP,int ene_DEF,int ene_ATT) {
		super(enemyName,infor,ene_HP,ene_DEF,ene_ATT);
	}
	
	public norEnemy(int ene_HP) {
		super(ene_HP);
	}
	@Override
	public void getDamage(int ATT) {
		super.getDamage(ATT);
	}
	
	public void normalATT(Character character) {
		super.normalATT(character);
	}
}