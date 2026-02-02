package ex1_String;


/*
 * 변수에 "O" 또는 "X"값을 저장
 * OOXXO라면 1 + 2 + 0 + 0 + 1의 결과인 4가 출력
 * OXXOOXOOO 라면 10이 출력
 */

public class Ex4_work {

	public static void main(String[] args) {
		String question = "OOXXOOXOOO";
		int sum = 0;
		int cnt = 1;
		for(int i=0 ; i<question.length() ; i++) {
			if(question.charAt(i) == 'O') {
				sum += cnt++;
			}
			else {
				cnt = 1;
			}
		}//for
		
		System.out.println(sum);
		
	}//main

}
