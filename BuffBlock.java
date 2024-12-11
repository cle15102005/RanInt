package game;
import java.util.Scanner;

public class BuffBlock {
	private int max = 7;
	private Buff availableBuff[] = new Buff[max];
	private int count = 0;
	Scanner input = new Scanner(System.in);
	
	void addBuff(Buff newBuff) {
		if (count >= max) {
			System.out.println("Out of range!");
		}
		else {
			availableBuff[count] = newBuff;
			count += 1;
		}
	}
	
	void removeBuff(Buff removeBuff) {
		for (int i = 0; i < count; i++) {
			if (availableBuff[i] == removeBuff) {
				for (int j = i; j < count - 1; j++) {
                    availableBuff[j] = availableBuff[j + 1];
                }
                availableBuff[count - 1] = null;
                count--;
                System.out.println("The buff has been removed!");
                return;
			}	
			
	    }
		System.out.println("The buff is not available!");
	}
	public static void main(String[] args) {
		Buff games = new Buff("Games", -100, -100, 0);
		Buff over_sleep = new Buff("Over sleep", 0, -100,0);
		Buff fall_in_love = new Buff("Fall in love", -50, -50, 0);
		Buff heavy_rain = new Buff("Heavy rain", 0, -50, 0);
		Buff Tet_holiday = new Buff("Tet holiday", 0, 100, 0);
		Buff take_a_nap = new Buff("Take a nap", 0, 50, 0);
		Buff coffee_time = new Buff("Coffee time", 50, 50, 100); 
		// buff coffee time the bonus HP is temporary, return previous HP 1 attack
        
		BuffBlock availableBuff = new BuffBlock();
		//availableBuff.max = 7;
		availableBuff.addBuff(games);
		availableBuff.addBuff(over_sleep);
		availableBuff.addBuff(fall_in_love);
		availableBuff.addBuff(heavy_rain);
		availableBuff.addBuff(Tet_holiday);
		availableBuff.addBuff(take_a_nap);
		availableBuff.addBuff(coffee_time);
		
	}

}
