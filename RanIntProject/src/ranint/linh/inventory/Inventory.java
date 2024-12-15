package ranint.linh.inventory;

import java.util.Scanner;
import ranint.hai.currency.Currency;
import ranint.linh.character.Character;
import ranint.cuong.item.Item;

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
		System.out.println("(?) Do you want to take " + item.getName() + 
				" or not?\n1. Equip. 2: Use immediately, 3. Igore it.");
		int answer = input.nextInt();
		if (answer == 1) {
			character.equipItem(item);
		} 
		else if (answer == 2) {
			character.useItemImmediately(item);
			character.showStat();
		}
		else {
			System.out.println("(+) You are so cool, you don't need anything.");
		}
	}	
}