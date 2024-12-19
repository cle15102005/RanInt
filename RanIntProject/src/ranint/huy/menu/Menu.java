package ranint.huy.menu;
import java.util.Scanner;
import ranint.linh.character.Character;

public class Menu {
	private Scanner scanner=new Scanner(System.in);
	
	public String chooseName() {
		System.out.println("Enter your name: ");
		String name=scanner.nextLine();
		System.out.println("Now your character name is:  "+name);
		return name;
		}
	
	public int chooseAge() {
		System.out.println("Enter your age: ");
		int studentAge = scanner.nextInt();
		System.out.println("Your age is: "+ studentAge);
		return studentAge;
	}
	
	public Course chooseCourse(Character character) {
		Course courses[]= {new Course("Calculus 1", 3, 3400.0f),
						   new Course("Algebra", 3, 3400.0f),
						   new Course("Intro to programing", 4, 3740.0f)
				};
		
		System.out.println("(?) What subject do you want to choose?");
		System.out.println("[Coures]-[Credit]-[Cost]");
		for(int i=0; i< courses.length; i++) {
			System.out.printf("%d. [%s] - [%d] - [%.0f]\n",i+1, courses[i].getName(), courses[i].getCredit(), courses[i].getCost() );
		}
		
		System.out.println("Your choose: ");
		int nb= scanner.nextInt();
		character.getMoney().registerCourse(courses[nb-1]);
		System.out.println(character.getMoney().getBalance());
		return courses[nb-1];
	}
}