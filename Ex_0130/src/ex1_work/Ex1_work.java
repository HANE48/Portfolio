package ex1_work;


/*
 * 배, 사과, 오렌지를 키운다
 * 하루에 5, 7, 5개가 생산된다
 * 1) 하루에 생산되는 과일의 총 갯수를 출력
 * 2) 시간당 전체 과일의 평균 생산갯수를 출력
 * 단, 각 과일의 수를 담을 변수는 int
 * 시간당 전체 과일의 평균을 담을 변수는 float
 */

public class Ex1_work {

	public static void main(String[] args) {
		
		int pear = 5, apple = 7, orange = 5;
		
		System.out.println("하루에 생산되는 과일의 총 갯수: " + (pear+apple+orange));
		System.out.println("시간당 전체 과일의 평균 생산갯수: " + ((float)(pear + apple + orange)/24));
		
	}//main

}
