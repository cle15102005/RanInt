package ranint.huy.enemy;

import java.util.ArrayList;
import java.util.Random;

import ranint.linh.buff.Buff;

public class EnemyBlock {
	Random rand= new Random();
	private int max = 10;
	private norEnemy existingEnemies[] = new norEnemy[max];
	private int count = 0;
	
	public void addNorEnemies(norEnemy norEnemy) {
		existingEnemies[count] = norEnemy;
		count += 1;
	}
	
	public norEnemy selectEnemy() {
		EnemyBlock add = new EnemyBlock();
		norEnemy nor_en1= new norEnemy("nor_en1","bai kiem tra lien tuc 1",100,50,50);
		norEnemy nor_en2= new norEnemy("nor_en2","bai kiem tra lien tuc 2",100,50,50);
		norEnemy nor_en3= new norEnemy("nor_en3","bai kiem tra lien tuc 3",100,50,50);
		norEnemy nor_en4= new norEnemy("nor_en4","bai kiem tra lien tuc 4",100,50,50);
		norEnemy nor_en5= new norEnemy("nor_en5","bai kiem tra lien tuc 5",100,50,50);
		norEnemy nor_en6= new norEnemy("nor_en6","bai kiem tra lien tuc 6",100,50,50);
		norEnemy nor_en7= new norEnemy("nor_en7","bai kiem tra lien tuc 7",100,50,50);
		norEnemy nor_en8= new norEnemy("nor_en8","bai kiem tra lien tuc 8",100,50,50);
		norEnemy nor_en9= new norEnemy("nor_en9","bai kiem tra lien tuc 9",100,50,50);
		norEnemy nor_en10= new norEnemy("nor_en10","bai kiem tra lien tuc 10",100,50,50);
		this.addNorEnemies(nor_en1);
		this.addNorEnemies(nor_en2);
		this.addNorEnemies(nor_en3);
		this.addNorEnemies(nor_en4);
		this.addNorEnemies(nor_en5);
		this.addNorEnemies(nor_en6);
		this.addNorEnemies(nor_en7);
		this.addNorEnemies(nor_en8);
		this.addNorEnemies(nor_en9);
		this.addNorEnemies(nor_en10);
		return existingEnemies[rand.nextInt(0,10)];
	}
}