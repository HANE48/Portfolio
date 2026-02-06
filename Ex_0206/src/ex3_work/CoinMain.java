package ex3_work;

/*
 * 냅색
 */

public class CoinMain {

	public static void main(String[] args) {
		Coin c = new Coin();
		
		System.out.println(c.getMoney());
		for(int i=0 ; i<c.getCoinLength() ; i++) {
			int n = c.chkCoin(i);
			if(n != 0) {
				System.out.println(n);
			}
			
//			if(c.chkCoin(i) != 0) {
//				System.out.println(c.chkCoin(i));
//			}
			
		}
		
	}//main

}
