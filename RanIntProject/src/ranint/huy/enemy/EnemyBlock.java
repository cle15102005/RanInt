package ranint.huy.enemy;

import java.util.Random;

public class EnemyBlock {
	Random rand= new Random();
	private int max = 5;
	private norEnemy existingEnemies[] = new norEnemy[max];
	private int count = 0;
	
	public void addNorEnemies(norEnemy norEnemy) {
		existingEnemies[count] = norEnemy;
		count += 1;
	}
	
	public norEnemy selectEnemy() {
		// HP - DEF - ATT
		norEnemy nor_en1= new norEnemy("nor_en1","Bai kiem tra lien tuc", 800, 400, 700);
		norEnemy nor_en2= new norEnemy("nor_en2","Len bang tra bai", 900, 450, 800);
		norEnemy nor_en3= new norEnemy("nor_en3","Bai tap ve nha", 700, 400, 700);
		norEnemy nor_en4= new norEnemy("nor_en4","Bai tap nhom", 900, 500, 800);
		norEnemy nor_en5= new norEnemy("nor_en5","Thuyet trinh", 900, 400, 800);
		//norEnemy nor_en6= new norEnemy("nor_en6","bai kiem tra lien tuc 6",500,200,800);
		//norEnemy nor_en7= new norEnemy("nor_en7","bai kiem tra lien tuc 7",500,200,800);
		//norEnemy nor_en8= new norEnemy("nor_en8","bai kiem tra lien tuc 8",500,200,800);
		//norEnemy nor_en9= new norEnemy("nor_en9","bai kiem tra lien tuc 9",500,200,800);
		//norEnemy nor_en10= new norEnemy("nor_en10","bai kiem tra lien tuc 10",500,200,800);
		this.addNorEnemies(nor_en1);
		this.addNorEnemies(nor_en2);
		this.addNorEnemies(nor_en3);
		this.addNorEnemies(nor_en4);
		this.addNorEnemies(nor_en5);
		//this.addNorEnemies(nor_en6);
		//this.addNorEnemies(nor_en7);
		//this.addNorEnemies(nor_en8);
		//this.addNorEnemies(nor_en9);
		//this.addNorEnemies(nor_en10);
		return existingEnemies[rand.nextInt(0,5)];
	}
}