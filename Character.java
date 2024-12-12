package game;
import java.util.Scanner;

public class Character {
	private int HP = 1000;
	private int ATT = 1000;
	private int DEF = 1000;
	private String name;
	private String char_class;
	private int age;
	private Inventory inventory = new Inventory();
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
	
	void normalATT(int enermy_ATT) {	
		this.getDamage(enermy_ATT);
		if (this.DEF <= 0) {
			System.out.println("You are dead. Game over!");
		}
	}
	
	void getDamage(int damage){
		this.DEF = DEF - damage;
		
		if (this.DEF > 800 && this.DEF <= 1000) {
			setHP(0);
		}
		else if (this.DEF > 650) {
			setHP(-200);
		}
		else if (this.DEF > 500) {
			setHP(-300);
		}
		else if (this.DEF > 300) {
			setHP(-500);
		}
		else {
			setHP(-700);
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
		System.out.println("HP: " + this.HP);
		System.out.println("ATT: " + this.ATT);
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
