package game;
import java.util.Scanner;

public class Inventory {
	private Currency currency;
	private Item Item[] = new Item[15];
	private int index = 0;
	Scanner input = new Scanner(System.in);
	
	public Boolean equipItem(Item item) {
		if (index < 15) {
			Item[index] = item;
			System.out.println("This " + item.getName() + " has been added to your Inventory.");
			index ++;
			return true;
		}
		else {
		    System.out.println("Your bag is full!");
		    return false;
		}
	}
	
	public void takeOrNot(Item item, Character character) {
		System.out.println("Do you want to take " + item.getName() + 
				" or not?, type 1 to equip, 2 to use immediately, other to do nothing.");
		int answer = input.nextInt();
		System.out.println(answer);
		if (answer == 1) {
			if (equipItem(item)) {
				System.out.println("This " + item.getName() + " has been equiped.");
			}
		} 
		else if (answer == 2) {
			character.setATT(item.getBonusATT());
			character.setDEF(item.getBonusDEF());
			character.setHP(item.getBonusHP());
			System.out.println("Congratulate! You are successful using \" + item.getName() + \"!");
		}
		else {
			System.out.println("OK, go ahead!");
		}
	}
	
	public void useItem(Item item, Character character) {
		Boolean check = false;
		for (int i = 0; i < index; i++) {
			if (Item[i].getName() == item.getName()) {
				character.setATT(item.getBonusATT());
				character.setDEF(item.getBonusDEF());
				character.setHP(item.getBonusHP());
				System.out.println("Congratulate! You are successful using " + item.getName() + "!");
				check = true;
				for (int j = i; j < index-1; j++) {
					Item[j] = Item[j+1];
				}
				Item[index-1] = null;
				index --;
				break;
			}
		}
		if (check == false) {
			System.out.println("You haven't equip this item.");
		}	
	}

	public void showItems() {
		System.out.print("Your current items are: ");
		for (int i = 0; i < index; i++) {
			System.out.print(Item[i] + " ,");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Item item1 = new Item("item1", 50, 50, 0);
		Item item2 = new Item("item2", 100, 50, 0);
		Item item3 = new Item("item3", 50, 50, 0);
		Character character = new Character();
		Inventory inventory = new Inventory();
		inventory.equipItem(item1);
		inventory.equipItem(item3);
		inventory.takeOrNot(item2, character);
		inventory.useItem(item3, character);
	}
}
