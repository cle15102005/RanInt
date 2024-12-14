package RanIntProject.src.ranint.linh.buff;

import java.util.Random;

public class BuffBlock {
	Random rand = new Random();
	private int max = 7;
	private Buff availableBuff[] = new Buff[max];
	private int count = 0;
	
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
	
	public Buff selectBuff() {
		
		Buff games = new Buff("Games", "Oh no, you're addicted to gaming!", -100, 0, -100);
		Buff over_sleep = new Buff("Over sleep", "Wake up quickly, or you'll be late for class!", 0, -50, -50);
		Buff fall_in_love = new Buff("Fall in love", "Oh, young love! But don't forget to study, okay?", -50, -50, 100);
		Buff heavy_rain = new Buff("Heavy rain", "It's raining heavily, be careful not to slip! Oh...Plop...", 0, -50, -100);
		Buff Tet_holiday = new Buff("Tet holiday", "It's Tết, time to relax and unwind!", 0, 100, 300);
		Buff take_a_nap = new Buff("Take a nap", "A short nap is also very precious.", 0, 50, 100);
		Buff coffee_time = new Buff("Coffee time", "Let’s drink a cup of coffee and wake up before we doze off again!", 50, 50, 150); 
		// buff coffee time the bonus HP is temporary, return previous HP 1 attack
        
		//availableBuff.max = 7;
		this.addBuff(games);
		this.addBuff(over_sleep);
		this.addBuff(fall_in_love);
		this.addBuff(heavy_rain);
		this.addBuff(Tet_holiday);
		this.addBuff(take_a_nap);
		this.addBuff(coffee_time);
		
		return availableBuff[rand.nextInt(0,7)];
	}
}