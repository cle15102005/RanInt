package game;
import java.util.Scanner;
import java.util.Random;

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
	
	public Buff randBuff() {
		Random rand = new Random();
		int randomIndex = rand.nextInt(availableBuff.length); 
		Buff randomBuff = availableBuff[randomIndex];
		return randomBuff;
	}

	public BuffBlock buidBuffBlock() {
		Buff games = new Buff("Games", "Oh no, you're addicted to gaming!", -100, -100, 0);
		Buff over_sleep = new Buff("Over sleep", "Wake up quickly, or you'll be late for class!", 0, -100,0);
		Buff fall_in_love = new Buff("Fall in love", "Oh, young love! But don't forget to study, okay?", -50, -50, 0);
		Buff heavy_rain = new Buff("Heavy rain", "It's raining heavily, be careful not to slip! Oh...Plop...", 0, -50, 0);
		Buff Tet_holiday = new Buff("Tet holiday", "It's Tết, time to relax and unwind!", 0, 100, 0);
		Buff take_a_nap = new Buff("Take a nap", "A short nap is also very precious.", 0, 50, 0);
		Buff coffee_time = new Buff("Coffee time", "Let’s drink a cup of coffee and wake up before we doze off again!", 50, 50, 100); 
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
		
		return availableBuff;
	}
	
	public static void main(String[] args) {
	    BuffBlock buff_block = new BuffBlock();
	    Character character = new Character();
	    buff_block = buff_block.buidBuffBlock();
	    Buff buff = buff_block.randBuff();
	    System.out.println(buff.getBuffName());
	    buff.active_buff(buff, character);
	    character.showStat();
	}
}
