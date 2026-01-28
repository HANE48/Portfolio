package ex2_label;
/*
 * 바깥 반복문: i = 1 ~ 9
 * 안쪽 반복문: j = 1 ~ 9
 * 
 * i * j == 10 미만이면 출력하지 않고 다음 j로 넘어간다
 * 	단 continue 사용금지
 * i * j 가 25를 처음으로 넘는순간
 * 그 값을 출력하고
 * 모든 반복문을 즉시 종료한다
 * 
 */
public class Ex3_label {

	public static void main(String[] args) {
		
		outer : for(int i = 1 ; i<=9 ; i++) {
			for(int j = 1 ; j<=9 ; j++ ) {
				if(i*j>=10) {
					System.out.println(i*j);
				}
				if(i*j>25) {
					System.out.println(i*j);
					break outer;
				}
			}//inner
		}//outer
		
	}//main

}
