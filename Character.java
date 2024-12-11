package game;
import java.util.Scanner;

public class Character {
	private int HP = 1000;
	private int ATT = 1000;
	private int DEF = 1000;
	private String name;
	private String char_class;
	private int age;
	Scanner input = new Scanner(System.in);
	
    void useSpecialSkill() {
		
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
		this.HP = this.HP + bonusHP;
	}
	
	void setATT(int bonusATT) {
		this.ATT = this.ATT + bonusATT;
	}
	
	void setDEF(int bonusDEF) {
		this.DEF = this.DEF + bonusDEF;
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
	
	public static void main(String[] args) {
		Character demo = new Character();
		demo.setInformation();
		demo.showInformation();
		demo.showStat();
	}

}
