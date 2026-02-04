package ex9_game;

import java.util.Random;

public class Game {
	
	private int num;
	
	public Game() {
		num = new Random().nextInt(50) + 1;
	}
	
	public String checkNum(int num) {
		if(this.num == num) {
			return "ANSWER!";
		}else {
			return this.num > num ? "UP!" : "DOWN!";
		}
	}
	
	
}
