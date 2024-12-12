package missionOfHuy;
import java.util.ArrayList;
import java.util.List;
public class BossBlock {
	public ArrayList<Boss> existingBoss = new ArrayList<Boss>();
	Boss boss_mid=new Boss(400,300,200);
	Boss boss_end=new Boss(1200,800,700);
	public void addBoss(Boss boss) {
		existingBoss.add(boss_mid);
		existingBoss.add(boss_end);
	}
	public void removeBoss(Boss boss) {
		if (boss_mid.getEne_HP()==0) {
			existingBoss.remove(boss_mid);
		}
		if (boss_end.getEne_HP()==0) {
			existingBoss.remove(boss_end);
		}
	}
}
