package ex1_work;

import java.util.Random;

/*
 * 변수 money에 10~5000사이의 난수를 발생시키고
 * 1의 자리숫자는 0이여야 하며
 * 500원, 100원, 50원, 10원이 각 몇개씩 필요한지를 계산 후 출력
 * 단 0개는 출력하지 않음
 */

public class Ex10_work {

	public static void main(String[] args) {
		
		int[] arr = {500, 100, 50, 10};
		int[] count = {0, 0, 0, 0};
		
		int money = new Random().nextInt(500 - 10 +1) + 10;
		money *= 10;
		System.out.println("돈: " + money);
		
		
		for(int i=0 ; i<arr.length ; i++) {
			if(money % arr[i] != 0 || money<100) {
				count[i] = money / arr[i];
				money %= arr[i];
			}
			
			//int res = money / arr[i];
			//if(res){
			//	System.out.printf("%d원: %d개\n", arr[i], res);
			//	money %= arr[i];
			//}
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			if(count[i] == 0) {
				continue;
			}
			System.out.print(arr[i] + "원: " + count[i] + "개\n");
		}
		
	}//main

}
