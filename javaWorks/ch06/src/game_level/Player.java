package game_level;

public class Player {
	// field
	private PlayerLevel level;
	
	// 생성자
	public Player() {
		level = new Beginner();
		level.showLevelMsg();
		
	}
	
	// showLevelMsg 변경하는 method(다형성)
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMsg();
	}
	
	// play하는 method
	public void play(int count) {
		level.go(count);
	}

}
