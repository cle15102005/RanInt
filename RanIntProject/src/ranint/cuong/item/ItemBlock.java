package ranint.cuong.item;

import java.util.ArrayList;
import java.util.Random;

public class ItemBlock {
	private Random rand= new Random();
	private ArrayList<Item> availableItems= new ArrayList<Item>();
	
	public void addItem(Item item) {
		availableItems.add(item);
	}
    
	public Item selectItem() {
		/* Item: Name- Info- ATT- HP- DEF;
		 * Item: Name- Info- ATT;
		 * Item: Name- Info- HP- DEF;
		 */
		
		Item item1= new Item("Hust jacket", "Looks cool, have lover yet?", 100, 100, 100);
		Item item2= new Item("Hust shirt", "You love Hust a lot, huh.", 80);
		Item item3= new Item("Hust pant", "Okay too much love for your school.", 70, -20, -20);
		Item item4= new Item("Redblue", "Feels so good", 70, 70);
		Item item5= new Item("Tài liệu CLB HTHT", "Đại cương không khó- Đã có Cú lo", 90, 0, 90);
		Item item6= new Item("Student's id card", "So arrogant", 50, 60);
		Item item7= new Item("Library's book", "You feel full of knowledge", 90);
		Item item8= new Item("Banhmi", "Yummy- Tasty- Cheap", 50, 40);
		Item item9= new Item("Number 1 water", "Taste like water", 10, 20, 10);
		Item item10= new Item("Buttermilk bread", "Naice. Don't let your stomach empty", 0, 40, 0);
		
		this.addItem(item1);
		this.addItem(item2);
		this.addItem(item3);
		this.addItem(item4);
		this.addItem(item5);
		this.addItem(item6);
		this.addItem(item7);
		this.addItem(item8);
		this.addItem(item9);
		this.addItem(item10);
		return availableItems.get(rand.nextInt(availableItems.size()));
	}
}
