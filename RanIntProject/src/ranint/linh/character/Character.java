package ranint.linh.character;
import java.util.Scanner;

import ranint.cuong.item.Item;
import ranint.hai.money.Money;
import ranint.huy.enemy.Enemy;
import ranint.linh.inventory.Inventory;

public class Character {
	protected int HP = 1000;
	protected int ATT = 1000;
	protected int DEF = 500;
	protected String name;
	protected String char_class;
	protected int age;
	protected Inventory inventory = new Inventory();
	protected Money money= new Money();
	int index = inventory.getIndex();
	Scanner input = new Scanner(System.in);
	
	public Inventory getInventory() {
		return inventory;
	}
	
	public Money getMoney() {
		return money;
	}
	
    public Boolean equipItem(Item item) {
		if (inventory.getIndex() < 15) {
			inventory.getItem()[inventory.getIndex()] = item;
			System.out.println("(+) " + item.getName() + " has been added to your Inventory.");
			inventory.setIndex(1);
			return true;
		}
		else {
		    System.out.println("(+) Your bag is full!");
		    return false;
		}
	}
    
    public void useItemImmediately(Item item) {
    	this.setATT(item.getBonusATT());
		this.setDEF(item.getBonusDEF());
		this.setHP(item.getBonusHP());
	}
    
	public void useItem(String itemName) {
		Boolean check = false;
		for (int i = 0; i < inventory.getIndex(); i++) {
			//"==" in java compare the  address of 2 STRINGs not their value
			if (inventory.getItem()[i].getName().equals(itemName)) {
				this.useItemImmediately(inventory.getItem()[i]);
				System.out.println("(+) You've used" + inventory.getItem()[i].getName() + inventory.getItem()[i].getInfo());
				check = true;
				for (int j = i; j < inventory.getIndex()-1; j++) {
					inventory.getItem()[j] = inventory.getItem()[j+1];
				}
				inventory.getItem()[inventory.getIndex()-1] = null;
				inventory.setIndex(-1);
				break;
			}
		}
		if (check == false) {
			System.out.println("You haven't equip this item.");
		}	
	}
	
	public void showItems() {
		System.out.printf("(+) Your current items are:\n");
		for (int i = 0; i < inventory.getIndex(); i++) {
			System.out.printf(" || "+ inventory.getItem()[i].getName() + " || \n");
		}
		System.out.println();
	}
	
	public void normalATT(Enemy enemy) {	
		//this.getDamage(enermy.getEne_ATT());
		enemy.getDamage(this.ATT);
	}
	
	public void getDamage(int damage){
		int HP_lose = DEF - damage;
		
		if (HP_lose < 0) {
			setHP(HP_lose);
		}
	}
	
	public void setHP(int bonusHP) {
		if (this.HP + bonusHP >= 1000) {
			this.HP = 1000;
		}
		else if (this.HP + bonusHP <= 0) {
			this.HP = 0;
			System.out.println("You are dead...");
		}
		else {
		    this.HP = this.HP + bonusHP;
		}
	}
	
	public void setATT(int bonusATT) {
		if (this.ATT + bonusATT >= 1000) {
			this.ATT = 1000;
		}
		else if (this.ATT + bonusATT <= 0) {
			this.ATT = 0;
		}
		else {
		    this.ATT = this.ATT + bonusATT;
		}
	}
	
	public void setDEF(int bonusDEF) {
		if (this.DEF + bonusDEF >= 500) {
			this.DEF = 500;
		}
		else if (this.DEF + bonusDEF <= 0) {
			this.DEF = 0;
		}
		else {
		    this.DEF = this.DEF + bonusDEF;
		}
	}
	
	public int getHP() {
		return HP;
	}

	public int getATT() {
		return ATT;
	}

	public int getDEF() {
		return DEF;
	}
	
	public String getCharClass() {
		return char_class;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCharClass(String _class) {
		this.char_class = _class;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setInformation(String name, String _class, int age) {
		this.setName(name);
		this.setCharClass(_class);
		this.setAge(age);
	}
	
	public void showStat() {
		System.out.println("(+) Your current stats:");
		System.out.println("HP: " + this.HP + "/1000");
		System.out.println("ATT: " + this.ATT + "/1000");
		System.out.println("DEF: " + this.DEF + "/500");
	}
	
	public void showInformation() {
		System.out.println("(+) Character's information:");
		System.out.println("Name: " + this.name);
		System.out.println("Class: " + this.char_class);
		System.out.println("Age: " + this.age);
		System.out.println("Your money: "+ this.getMoney().getBalance());
	}
	
	public void useSpecialSkill(Enemy enemy) {}
}