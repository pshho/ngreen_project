package game_level;

public class MainBoard {
	
	public static void main(String[] args) {
		// Player 객체
		Player player = new Player();
		
		// 처음 생성된 초보자 플레이어
		player.play(1);
		
		System.out.println();
		
		// 중급자 레벨
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		System.out.println();
		
		// 상급자 레벨
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}
	
}
