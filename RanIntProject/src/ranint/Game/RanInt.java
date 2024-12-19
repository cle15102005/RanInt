package ranint.Game;
import java.util.Scanner;

import ranint.linh.character.Character;
import ranint.linh.character.IT_e10;
import ranint.linh.character.IT_e15;
import ranint.cuong.map.Map;
import ranint.huy.menu.Course;
import ranint.huy.menu.Menu;

public class RanInt {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		Menu menu= new Menu();
		String name= menu.chooseName();
		
		String _class;
		Character player;
		while(true) {
			System.out.println("Enter your class (ITe10 or ITe15):");
			_class = scan.nextLine();
			if (_class.equals("ITe15")) {
				//up casting but method useSpecialSkill() has been defined in parent class Character
				//player still can use its overridden method
				player = new IT_e15();
				break;
			}
			else if (_class.equals("ITe10")) {
				player = new IT_e10();
				break;
			}
		}
		
		int age= menu.chooseAge();
		
		//player		
		player.setInformation(name, _class, age);
		player.getMoney().setInitialFunds(10000.0f);
		player.showInformation();
		player.showStat();
		
		System.out.println("Press Enter to continue.");
		scan.nextLine();
		
		Course course= menu.chooseCourse(player);
		//First map
		Map map1= new Map(course, player);
		map1.makeMap();
		
		//Moving character
		map1.play();
		
		scan.close();
	}
}
