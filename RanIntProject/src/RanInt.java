import ranint.linh.character.Character;

public class RanInt {

	public static void main(String[] args) {
		//player
		Character player = new Character();
		player.setInformation();
		player.showInformation();
		player.showStat();
		
		//First map
		Map map1= new Map("Stage 1", player);
		map1.makeMap();
		
		//Moving character
		map1.play();
	}
}
