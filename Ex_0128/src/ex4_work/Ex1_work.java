package ex4_work;

import java.util.Random;

/*
 * 변수 money에 10 ~ 5000사이의 난수를 발생시킨다
 * 단 3450, 2100과 같이 1의 자리의 숫자는 반드시 0이여야 한다
 * 발생한 난수 money를 동전으로 바꿨을 때 500원 100원 50원 10원 짜리 동전이 몇 개짜리를 판단하여 출력
 * 단, 가능한 한 적은 수의 동전으로 거슬러줘야 한다
 * ------------------------------------------------------------------------
 * 난수: 2590(난수로 만듬)
 * 500원: 5
 * 50원: 1
 * 10원: 4
 */

public class Ex1_work {

	public static void main(String[] args) {
		
		int[] coin = {500, 100, 50, 10};
		int[] count = {0, 0, 0, 0};
		int money = new Random().nextInt(4991) + 10;
		
		if(money % 10 != 0) {
			money /= 10;
			money *= 10;
		}
		System.out.println("난수로 만든 돈: " + money);
		
		for(int i=0 ; i<count.length ; i++) {
			if(money % coin[i]  == 0) {
				count[i] = money / coin[i];
				money %= coin[i];
			}
			if(money % coin[i] > 0) {
				count[i] = money / coin[i];
				money %= coin[i];
			}
		}//for
		
		
		for(int i=0 ; i<count.length ; i++) {
			if(count[i] == 0) {
				continue;
			}
			
			System.out.println(coin[i] + "원: " + count[i]);
			
		}//for
		
	}//main

}
