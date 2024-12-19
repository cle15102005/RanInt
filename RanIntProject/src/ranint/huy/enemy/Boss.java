package ranint.huy.enemy;

import ranint.linh.character.Character;
public class Boss extends Enemy {
	EnemyBlock subEne= new EnemyBlock();
	public void AdditionalEnemies() {
        norEnemy enemy1 = new norEnemy("enemy1","fami mai dink",80, 40, 40); 
        norEnemy enemy2 = new norEnemy("enemy2","fami la so 1",80, 40, 40);
        subEne.addNorEnemies(enemy1);
        subEne.addNorEnemies(enemy2);
    }
	
	public Boss(String enemyName,String infor,int ene_HP,int ene_DEF,int ene_ATT) {
		super(enemyName,infor,ene_HP,ene_DEF,ene_ATT);
	}
	public void useSkillBoss_End() {
		AdditionalEnemies();
	}
	
	public void useSkillBoss_Mid(Character character) {
		character.setATT(character.getATT()-100);
		// reduce ATT char
	}
	
	@Override
	public void getDamage(int ATT) {
		super.getDamage(ATT);
	}
	
	@Override
	public void normalATT(Character character) {
		super.normalATT(character);
	}
}