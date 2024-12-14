import java.util.Random;
import java.util.Scanner;

import ranint.cuong.item.Item;
import ranint.cuong.item.ItemBlock;
import ranint.cuong.battle.BattleBlock;
import ranint.huy.enemy.Enemy;
import ranint.huy.enemy.EnemyBlock;
import ranint.huy.enemy.norEnemy;
import ranint.linh.buff.Buff;
import ranint.linh.buff.BuffBlock;
import ranint.linh.character.Character;

public class Map {
    private String name;
    private Random rand= new Random();
    private int charater_location[]= new int[1];
    private int prev_move[] = new int[1]; 
    private int next_move[] = new int[1];
    private Character character;
    private EnemyBlock eb= new EnemyBlock();
    //private BossBlock bb= new BossBlock();
    private BuffBlock bb= new BuffBlock();
	private ItemBlock ib= new ItemBlock();
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
    	while(!escapse) {
    		this.showMap();
	    	Scanner inp= new Scanner(System.in);
	   		System.out.printf("Your next move( w, a, s, d): ");
	    	String move= inp.nextLine();
	    	prev_move= this.getCharater_location();
	   		int row= prev_move[0];
	   		int col= prev_move[1];
	   		
	    	switch(move) {
	   		case "w":
	    		row-=1;
	    		break; 		
		   	case "a":
		   		col-=1;
		   		break;
	    	case "s":
		    	row+=1;
		    	break;		
		    case "d":
		   		col+=1;
		   		break;	
	    	}
	    	int next_move[]= {row, col};
	    	this.setNext_move(next_move);
	    	
	    	switch(map[this.getNext_move()[0]][this.getNext_move()[1]]) {
	    	case 0:
	    		map[this.getCharater_location()[0]][this.getCharater_location()[1]]= 0;
	        	this.setCharater_location(next_move);
	    		map[this.getNext_move()[0]][this.getNext_move()[1]]= 1;
	    		this.showMap();
	    		break;
	    	case 2:
	    		this.norEnemyCounter();
	    		break;
	    	case 3:
	    		this.bossCounter();
	    		break;
	    	case 4:
	    		this.itemCounter();
	    		break;
	    	case 5:
	    		this.doorCounter();
	    		escapse= true;
	    		break;
	    	case 6:
	    		this.buffCounter();
	    		break;
	    	}
    	}
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
		norEnemy enemy= eb.selectEnemy();
		bbl.norBattle(character, enemy);
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
	
	public void bossCounter() {
		map[this.getCharater_location()[0]][this.getCharater_location()[1]]= 0;
    	this.setCharater_location(next_move);
		map[this.getNext_move()[0]][this.getNext_move()[1]]= 1;
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
		
		Item item= ib.selectItem();
		System.out.printf("(+) You are walking, and you see a %s.\n", item.getName());
		character.getInventory().takeOrNot(item, character);
		character.showStat();
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
		
		Buff buff= bb.selectBuff();
		System.out.printf("You have encountered something special. That is %s\n", buff.getBuffName());
		buff.activeBuff(buff, character);
		character.showStat();
	}
}


