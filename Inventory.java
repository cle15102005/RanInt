package game;
import java.util.Scanner;

public class Inventory {
	private Currency currency;
	private Item Item[] = new Item[15];
	private int index = 0;
	Scanner input = new Scanner(System.in);
	
	public Item[] getItem() {
		return Item;
	}

	public int getIndex() {
		return index;
	}

	public void takeOrNot(Item item, Character character) {
		System.out.println("Do you want to take " + item.getName() + 
				" or not?, type 1 to equip, 2 to use immediately, other to do nothing.");
		int answer = input.nextInt();
		System.out.println(answer);
		if (answer == 1) {
			character.equipItem(item);
		} 
		else if (answer == 2) {
			character.useItemImmediately(item);
			System.out.println("Congratulate! You are successful using " + item.getName() + "!");
		}
		else {
			System.out.println("OK, go ahead!");
		}
	}	
	
	public static void main(String[] args) {
		Item item1 = new Item("item1", 50, 50, 0);
		Item item2 = new Item("item2", 100, 50, 0);
		Item item3 = new Item("item3", 50, 50, 0);
		Character character = new Character();
		character.equipItem(item1);
		character.showStat();
		character.equipItem(item3);
		character.showStat();
		character.getInventory().takeOrNot(item2, character);
		character.useItem(item3);
		character.showStat();
		character.showItems();
		character.getDamage(370);
		character.showStat();
		
	}
}
