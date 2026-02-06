package ex3_work;

import java.util.Random;

public class Coin {
	
	private int[] coin = {500, 100, 50, 10};
	private int money;
	
	public Coin() {
		money = new Random().nextInt(500)+10;
		money *= 10;
	}
	
	public int chkCoin(int i) {
		int n = money / coin[i];
		money %= coin[i];
		//System.out.print(" n : " + n );
		return n;
	}
	
	public int getCoinLength() {
		return coin.length;
	}
	
	public int getMoney() {
		return money;
	}
}
