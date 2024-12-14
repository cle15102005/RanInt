package ranint.huy.menu;
import java.util.Scanner;

public class Menu {
	
	public void ChooseName() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=scanner.nextLine();
		System.out.println("Now your character name is:  "+name);
		scanner.close();
		}
	
	public void ChooseClass() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your class:ITE10 or ITE15 ");
	    String studentClass = scanner.nextLine();
		switch(studentClass) {
		case "ITE15":
			System.out.println("Your class will be ITe15");
			break;
		case "ITE10":
			System.out.println("Your class will be ITe10");
			break;
		default:
			System.out.println("Please enter again: ");
			ChooseClass();
			break;
		}
		scanner.close();
	}
	public void startButton() {}
}