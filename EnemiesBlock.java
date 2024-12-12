package missionOfHuy;
import java.util.ArrayList;
import java.util.List;
public class EnemiesBlock {
	public List<Enemies> existingEnemies = new ArrayList<Enemies>();
	public void addNorEnemies(norEnemies enemies) {
		existingEnemies.add(enemies);
	}
	public void removeNorEnemies(norEnemies enemies) {
		if (enemies.getEne_HP()<=0){
			existingEnemies.remove(enemies);
			
		}
	}
	public static void main(String[] args) {
		EnemiesBlock add = new EnemiesBlock();
		norEnemies nor_en1= new norEnemies(100,50,50);
		norEnemies nor_en2= new norEnemies(100,50,50);
		norEnemies nor_en3= new norEnemies(100,50,50);
		norEnemies nor_en4= new norEnemies(100,50,50);
		norEnemies nor_en5= new norEnemies(100,50,50);
		norEnemies nor_en6= new norEnemies(100,50,50);
		norEnemies nor_en7= new norEnemies(100,50,50);
		norEnemies nor_en8= new norEnemies(100,50,50);
		norEnemies nor_en9= new norEnemies(100,50,50);
		norEnemies nor_en10= new norEnemies(100,50,50);
		add.addNorEnemies(nor_en1);
		add.addNorEnemies(nor_en2);
		add.addNorEnemies(nor_en3);
		add.addNorEnemies(nor_en4);
		add.addNorEnemies(nor_en5);
		add.addNorEnemies(nor_en6);
		add.addNorEnemies(nor_en7);
		add.addNorEnemies(nor_en8);
		add.addNorEnemies(nor_en9);
		add.addNorEnemies(nor_en10);
	}
}
