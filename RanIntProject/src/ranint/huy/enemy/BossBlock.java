package ranint.huy.enemy;
import java.util.ArrayList;

public class BossBlock {
	public ArrayList<Boss> existingBoss = new ArrayList<Boss>();
	Boss boss_mid=new Boss("MID TERM EXAM","tach tach tach~~",400,300,200);
	Boss boss_end=new Boss("FINAL TERM EXAM","noi ac mong cua svbk",1200,800,700);
	
	public void addBoss(Boss boss) {
		existingBoss.add(boss);
	}
	
	public void removeBoss(Boss boss) {
		if (boss_mid.getEne_HP()==0) {
			existingBoss.remove(boss_mid);
		}
		if (boss_end.getEne_HP()==0) {
			existingBoss.remove(boss_end);
		}
	}
	
	public Boss selectBoss() {
		this.addBoss(boss_mid);
		return existingBoss.get(0);
	}
}