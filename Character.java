package game;
import java.util.Scanner;

public class Character {
	protected int HP = 1000;
	protected int ATT = 1000;
	protected int DEF = 300;
	protected String name;
	protected String char_class;
	protected int age;
	protected Inventory inventory = new Inventory();
	int index = inventory.getIndex();
	
	Scanner input = new Scanner(System.in);
	
	public Inventory getInventory() {
		return inventory;
	}
	
    public Boolean equipItem(Item item) {
		if (index < 15) {
			inventory.getItem()[index] = item;
			System.out.println("This " + item.getName() + " has been added to your Inventory.");
			index ++;
			return true;
		}
		else {
		    System.out.println("Your bag is full!");
		    return false;
		}
	}
    
    public void useItemImmediately(Item item) {
    	this.setATT(item.getBonusATT());
		this.setDEF(item.getBonusDEF());
		this.setHP(item.getBonusHP());
	}
    
	public void useItem(Item item) {
		Boolean check = false;
		for (int i = 0; i < index; i++) {
			if (inventory.getItem()[i].getName() == item.getName()) {
				this.useItemImmediately(item);
				System.out.println("Congratulate! You are successful using " + item.getName() + "!");
				check = true;
				for (int j = i; j < index-1; j++) {
					inventory.getItem()[j] = inventory.getItem()[j+1];
				}
				inventory.getItem()[index-1] = null;
				index --;
				break;
			}
		}
		if (check == false) {
			System.out.println("You haven't equip this item.");
		}	
	}
	
	public void showItems() {
		System.out.print("Your current items are: || ");
		for (int i = 0; i < index; i++) {
			System.out.print(inventory.getItem()[i].getName() + " || ");
		}
		System.out.println();
	}
	
	void normalATT(Enermy enermy) {	
		this.getDamage(enermy.getEne_ATT());
		enermy.GetDamage(this.ATT);
		if (this.HP <= 0) {
			System.out.println("You are dead. Game over!");
		}
	}
	
	void getDamage(int damage){
		int HP_lose = DEF - damage;
		
		if (HP_lose < 0) {
			setHP(HP_lose);
		}
	}
	
	void setHP(int bonusHP) {
		if (this.HP + bonusHP >= 1000) {
			this.HP = 1000;
		}
		else {
		    this.HP = this.HP + bonusHP;
		}
	}
	
	void setATT(int bonusATT) {
		if (this.ATT + bonusATT >= 1000) {
			this.ATT = 1000;
		}
		else {
		    this.HP = this.HP + bonusATT;
		}
	}
	
	void setDEF(int bonusDEF) {
		if (this.DEF + bonusDEF >= 1000) {
			this.DEF = 1000;
		}
		else {
		    this.HP = this.HP + bonusDEF;
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

	void setName() {
		System.out.println("Enter your name:");
		this.name = input.nextLine();
	}
	
	void setClass() {
		System.out.println("Enter your class:");
		this.char_class = input.nextLine();
	}
	
	void setAge() {
		System.out.println("Enter your age:");
		this.age = input.nextInt();
	}
	
	void setInformation() {
		this.setName();
		this.setClass();
		this.setAge();
	}
	
	void showStat() {
		System.out.println("Your current stat:");
		System.out.println("HP: " + this.HP + "/1000");
		System.out.println("ATT: " + this.ATT + "/1000");
		System.out.println("DEF: " + this.DEF);
	}
	
	void showInformation() {
		System.out.println("Character's information:");
		System.out.println("Name: " + this.name);
		System.out.println("Class: " + this.char_class);
		System.out.println("Age: " + this.age);
	}
	
	void useSpecialSkill() {}
	
	public static void main(String[] args) {
		Character demo = new Character();
		demo.setInformation();
		demo.showInformation();
		demo.showStat();
	}
}
