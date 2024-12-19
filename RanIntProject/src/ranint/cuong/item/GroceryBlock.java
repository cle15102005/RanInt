package ranint.cuong.item;

import java.util.Scanner;
import ranint.linh.character.Character;

public class GroceryBlock {
	Scanner inp= new Scanner(System.in);
	Item store[]= {new Item("Redblue", "Feels so good",0, 70, 70, 15.0f),
			   new Item("Tài liệu CLB HTHT", "Đại cương không khó- Đã có Cú lo", 90, 0, 90, 12.0f),
			   new Item("Banhmi", "Yummy- Tasty- Cheap", 0, 30, 40, 5.0f),
			   new Item("Number 1 water", "Taste like water", 10, 20, 10, 5.0f),
		};
	
	public void ask(Character character) {
		System.out.println("(?) Wanna visit it?\n1. Sure\n2. Nope");
		int opt= inp.nextInt();
		if(opt==1) {
			this.showGrocery(character);
		}
		else {
			System.out.println("Okay. Keep going then.");
		}
	}
	
	public void showGrocery(Character character) {
		System.out.println("_______Store_______");
		for(Item item: store) {
			System.out.println(" || "+ item.getName()+ ":" + item.getPrize());
		}
		System.out.println("(?) Do you want to buy anything?\n1. Sure\n2. Nope");
		int opt= inp.nextInt();
		if(opt==1) {
			this.buyItem(character);
		}
		else {
			System.out.println("Okay. Keep going then.");
		}
	}
	
	public void buyItem(Character character) {
		System.out.println("(+) Choose item to buy: (Currently, you can only buy one item).");
		Scanner inp= new Scanner(System.in);
		String itemName= inp.nextLine();
		
		for (Item item: store) {
			//"==" in java compare the address of 2 STRINGs not their value
			if (item.getName().equals(itemName)) {
				character.getMoney().purchaseItem(itemName, item.getPrize());
				character.equipItem(item);
				System.out.println("Your balance:"+ character.getMoney().getBalance());
				break;
			}
		}
		inp.close();
	}
}
