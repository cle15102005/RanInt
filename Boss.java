package missionOfHuy;

public class Boss extends Enemies {
	EnemiesBlock subEne= new EnemiesBlock();
	Character char1 = new Character();
	public void AdditionalEnemies() {
        norEnemies enemy1 = new norEnemies(80, 40, 40); 
        norEnemies enemy2 = new norEnemies(80, 40, 40);
        subEne.addNorEnemies(enemy1);
        subEne.addNorEnemies(enemy2);
    }
	public Boss(int ene_HP,int ene_DEF,int ene_ATT) {
		super(ene_HP,ene_DEF,ene_ATT);
	}
	public void useSkillBoss_End() {
		AdditionalEnemies();
	}
	public void useSkillBoss_Mid() {
		char1.setATT(-100);
		// giảm ATT char
	}
	@Override
	public void GetDamage() {
		super.GetDamage();
	}
	@Override
	public void NormalATT() {
		super.NormalATT();
	}
}
