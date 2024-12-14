package RanIntProject.src;

import java.util.Random;
import java.util.Scanner;

import RanIntProject.src.ranint.cuong.item.Item;
import RanIntProject.src.ranint.cuong.item.ItemBlock;
import RanIntProject.src.ranint.cuong.battle.BattleBlock;
import RanIntProject.src.ranint.huy.enemy.EnemyBlock;
import RanIntProject.src.ranint.huy.enemy.norEnemy;
import RanIntProject.src.ranint.linh.buff.Buff;
import RanIntProject.src.ranint.linh.buff.BuffBlock;
import RanIntProject.src.ranint.linh.character.Character;

public class Map {
    private String name;
    private Random rand= new Random();
    private int charater_location[]= new int[1];
    private int prev_move[] = new int[1]; 
    private int next_move[] = new int[1];
    private Character character;
    private BattleBlock bbl= new BattleBlock();
    public int map[][]= new int[5][5];
    
	public int[][] getMap() {
		return map;
	}

	public int[] getCharater_location() {
		return charater_location;
	}

	public void setCharater_location(int[] charater_location) {
		this.charater_location = charater_location;
	}
	
	public int[] getNext_move() {
		return next_move;
	}

	public void setNext_move(int[] next_move) {
		this.next_move = next_move;
	}
	
	public Map(String name, Character character) {
		super();
		this.name = name;
		this.character= character;
	}

	public void makeMap(){
		/*1: character location	;	 2: Enemy Block;
		  3: Boss Block			;	 4: Item Block;
		  5: Door Block			;	 6: Buff Block;
		 */
		setCharacter();
		setEnemy();
		setBoss();
		setItem();
		setDoor();
		setBuff();
	}
	
	public void showMap() {
		System.out.printf("_______%s_______\n", this.name);
		for(int i= 0; i< 5; i++) {
			for(int j=0; j< 5; j++) {
				if(map[i][j]==1) {
					System.out.printf(" %s ", "x ");
				}
				else if(map[i][j]==5) {
					System.out.printf(" %s ", "[]");
				}
				else {
					System.out.printf(" %s ", ". ");
				}
			}
			System.out.printf("\n");
		}
    }
	
	public void battle() {
		
	}
    public void play(){
    	boolean escapse= false;
    	Scanner inp= new Scanner(System.in);
    	System.out.println("INSTRUCTION:");
    	System.out.println("1, How to move: w->up, s->down, a->left, d->right");
    	System.out.println("2, When you finish a scene, you will be asked "
    			+ "\"What do you want to do next?\", "
    			+ "your options are: \n     1->show information"
    			+ "\n     2->show your available items"
    			+ "\n     3->show your stat"
    			+ "\n     4->use your available items"
    			+ "\n     5->move");
    	System.out.println("3, In the map appear on the screen, \"x\" is your current location "
    			+ "and \"[]\" is the escape door. "
    			+ "\n   Your task is to reach this door, get out the map and win! "
    			+ "\n============================================================================\n");
    	
    	while(!escapse) {
    		this.showMap();
    		System.out.println("What do you want to do next?");
    		String choice = inp.nextLine();
    		switch(choice) {
    		case "1":
    			character.showInformation();
    			break;
    		case "2":
    			character.showItems();
    			break;
    		case "3":
    			character.showStat();
    			break;
    		case "4":
    			character.showItems();
    			if (character.getInventory().getIndex() != 0) {
    				System.out.println("What do you want to use? Please enter its name:");
        			String item = inp.nextLine();
        			character.useItem(item);
    			}
    			else {
    				System.out.println("You have no available item in your inventory!");
    			}
    			
    			break;
    		case "5":
    			System.out.printf("Your next move (w, a, s, d): ");
    	    	String move= inp.nextLine();
    	    	prev_move= this.getCharater_location();
    	   		int row= prev_move[0];
    	   		int col= prev_move[1];
    	   		
    	   		//change "row" and "col" to match with the next location
    	    	switch(move) {
    	   		case "w":
    	    		row-=1;
    	    		if (row < 0) {
    	    			row = 0;
    	    		}
    	    		break; 		
    		   	case "a":
    		   		col-=1;
    		   		if (col < 0) {
    		   			col = 0;
    		   		}
    		   		break;
    	    	case "s":
    		    	row+=1;
    		    	if (row > 4) {
    	    			row = 4;
    	    		}
    		    	break;		
    		    case "d":
    		   		col+=1;
    		   		if (col > 4) {
    		   			col = 4;
    		   		}
    		   		break;	
    	    	}
    	    	int next_move[]= {row, col};
    	    	this.setNext_move(next_move);
    	    	
    	    	//which scene that character meet
    	    	switch(map[this.getNext_move()[0]][this.getNext_move()[1]]) {
    	    	case 0:
    	    		// visited, if turn back encounter nothing
    	    		map[this.getCharater_location()[0]][this.getCharater_location()[1]]= 0;
    	        	this.setCharater_location(next_move);
    	    		map[this.getNext_move()[0]][this.getNext_move()[1]]= 1;
    	    		this.showMap();
    	    		break;
    	    	case 2:
    	    		this.norEnemyCounter();
    	    		if (character.getHP() == 0) {
    	    			escapse = true;
    	    		}
    	    		break;
    	    	case 3:
    	    		this.bossCounter();
    	    		if (character.getHP() == 0) {
    	    			escapse = true;
    	    		}
    	    		break;
    	    	case 4:
    	    		this.itemCounter();
    	    		if (character.getHP() == 0) {
    	    			escapse = true;
    	    		}
    	    		break;
    	    	case 5:
    	    		this.doorCounter();
    	    		escapse= true;
    	    		break;
    	    	case 6:
    	    		this.buffCounter();
    	    		if (character.getHP() == 0) {
    	    			escapse = true;
    	    		}
    	    		break;
    	    	}
    	        break;
    		}
    	}
    	inp.close();
    	
    }
     
	public void setCharacter(){
		int r= rand.nextInt(0,5);
		int c= rand.nextInt(0,5);
		map[r][c]= 1;
		
		int temp_location[]= {r,  c};
		this.setCharater_location(temp_location);
	} 
	
	public void setEnemy() {
		int nbEnemies= 0;
		while(nbEnemies< 10) {
			int r= rand.nextInt(0,5);
			int c= rand.nextInt(0,5);
			if(map[r][c]==0) {
				map[r][c]= 2;
				nbEnemies+=1;
			}
		}
		
	}
	
	public void norEnemyCounter() {
		map[this.getCharater_location()[0]][this.getCharater_location()[1]]= 0;
    	this.setCharater_location(next_move);
		map[this.getNext_move()[0]][this.getNext_move()[1]]= 1;
		EnemyBlock eb= new EnemyBlock();
		norEnemy enemy= eb.selectEnemy();
		bbl.norBattle(character, enemy);
		character.showStat();
	}
	
	public void setBoss() {
		int nbBoss= 0;
		while(nbBoss< 2) {
			int r= rand.nextInt(0,5);
			int c= rand.nextInt(0,5);
			if(map[r][c]==0) {
				map[r][c]= 3;
				nbBoss+=1;
			}
		}
	}
	
	// haven't done yet
	public void bossCounter() {
		map[this.getCharater_location()[0]][this.getCharater_location()[1]]= 0;
    	this.setCharater_location(next_move);
		map[this.getNext_move()[0]][this.getNext_move()[1]]= 1;
		BuffBlock bb= new BuffBlock();
	}
	
	public void setItem() {
		int nbItems= 0;
		while(nbItems< 6) {
			int r= rand.nextInt(0,5);
			int c= rand.nextInt(0,5);
			if(map[r][c]==0) {
				map[r][c]= 4;
				nbItems+=1;
			}
		}
	}
	
	public void itemCounter() {
		map[this.getCharater_location()[0]][this.getCharater_location()[1]]= 0;
    	this.setCharater_location(next_move);
		map[this.getNext_move()[0]][this.getNext_move()[1]]= 1;
		ItemBlock ib= new ItemBlock();
		Item item= ib.selectItem();
		System.out.printf("(+) You are walking, and you see a %s.\n", item.getName());
		character.getInventory().takeOrNot(item, character);
		//character.showStat();
	}
	
	public void setDoor() {
		while(true) {
			int r= rand.nextInt(0,5);
			int c= rand.nextInt(0,5);
			if(map[r][c]==0) {
				map[r][c]= 5;
				break;
			}
		}
	}
	
	public void doorCounter() {
		map[this.getCharater_location()[0]][this.getCharater_location()[1]]= 0;
    	this.setCharater_location(next_move);
		map[this.getNext_move()[0]][this.getNext_move()[1]]= 1;
		System.out.println("____Stage clear____");
	}
	
	public void setBuff() {
		int nbBuffs= 0;
		while(nbBuffs< 5) {
			int r= rand.nextInt(0,5);
			int c= rand.nextInt(0,5);
			if(map[r][c]==0) {
				map[r][c]= 6;
				nbBuffs+=1;
			}
		}	
	}
    
	public void buffCounter() {
		map[this.getCharater_location()[0]][this.getCharater_location()[1]]= 0;
    	this.setCharater_location(next_move);
		map[this.getNext_move()[0]][this.getNext_move()[1]]= 1;
		System.out.println("_______Buff_______");
		BuffBlock bb = new BuffBlock();
		Buff buff= bb.selectBuff();
		System.out.printf("You have encountered something special. That is %s\n", buff.getBuffName());
		buff.activeBuff(buff, character);
		character.showStat();
	}
}


