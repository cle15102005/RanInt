package missionOfHuy;

public class norEnemies extends Enemies {
	public norEnemies(int ene_HP,int ene_DEF,int ene_ATT) {
		super(ene_HP,ene_DEF,ene_ATT);
	}
	public norEnemies(int ene_HP) {
		super(ene_HP);
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
