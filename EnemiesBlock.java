package missionOfHuy;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
public class EnemiesBlock {
	public List<Enemies> existingEnemies = new ArrayList<Enemies>();
	public Random rand = new Random();
	
	public void addNorEnemies(norEnemies enemies) {
		existingEnemies.add(enemies);
	}
	
	public void removeNorEnemies(norEnemies enemies) {
		if (enemies.getEne_HP()<=0){
			existingEnemies.remove(enemies);
			
		}
	}
	public norEnemies selectEnemy() {
		EnemiesBlock add = new EnemiesBlock();
		norEnemies nor_en1= new norEnemies("nor_en1","bai kiem tra lien tuc 1",100,50,50);
		norEnemies nor_en2= new norEnemies("nor_en2","bai kiem tra lien tuc 2",100,50,50);
		norEnemies nor_en3= new norEnemies("nor_en3","bai kiem tra lien tuc 3",100,50,50);
		norEnemies nor_en4= new norEnemies("nor_en4","bai kiem tra lien tuc 4",100,50,50);
		norEnemies nor_en5= new norEnemies("nor_en5","bai kiem tra lien tuc 5",100,50,50);
		norEnemies nor_en6= new norEnemies("nor_en6","bai kiem tra lien tuc 6",100,50,50);
		norEnemies nor_en7= new norEnemies("nor_en7","bai kiem tra lien tuc 7",100,50,50);
		norEnemies nor_en8= new norEnemies("nor_en8","bai kiem tra lien tuc 8",100,50,50);
		norEnemies nor_en9= new norEnemies("nor_en9","bai kiem tra lien tuc 9",100,50,50);
		norEnemies nor_en10= new norEnemies("nor_en10","bai kiem tra lien tuc 10",100,50,50);
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
		return existingEnemies.get(rand.nextInt(existingEnemies.size()));
	}
}
