package RanIntProject.src;

import RanIntProject.src.ranint.linh.character.Character;
import RanIntProject.src.ranint.linh.character.IT_e10;
import RanIntProject.src.ranint.linh.character.IT_e15;

import java.util.Scanner;

public class RanInt {

	public static void main(String[] args) {
		//player
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = input.nextLine();
		String _class;
		Character player;
		while(true) {
			System.out.println("Enter your class (ITe10 or ITe15):");
			_class = input.nextLine();
			if (_class.equals("ITe15")) {
				//up casting but method useSpecialSkill() has been defined in parent class Character
				//player still can use its overridden method
				player = new IT_e15();
				System.out.println("Enter your age:");
				int age = input.nextInt();
				player.setInformation(name, _class, age);
				break;
			}
			else if (_class.equals("ITe10")) {
				player = new IT_e10();
				System.out.println("Enter your age:");
				int age = input.nextInt();
				player.setInformation(name, _class, age);
				break;
			}
		}
		
		
		player.showInformation();

		player.showStat();
		
		//First map
		Map map1= new Map("Stage 1", player);
		map1.makeMap();
		
		//Moving character
		map1.play();
	}
}
