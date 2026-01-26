package ex3_operand;

public class Ex7_work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 과수원이 있다
		 배, 사과, 오렌지가 있으며
		 하루에 각각 5, 7, 5개를 생산한다
		 1) 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
		 2) 시간당 전체 과일의 평균 생산갯수를 출력 
		 단, 각 과일의 수를 담은 변수는 정수이며 시간당 전체 과일의 평균을 담을 변수는 float
		 */
		int apple = 7, pear = 5, orange = 5;
		int fruit = apple + pear + orange;
		float avg = (float)fruit/24f;
		
		System.out.println("하루에 생산되는 과일의 총 갯수: " + fruit);
		System.out.println("시간당 전체 과일의 평균갯수: " + avg);
		
		
	}//main
	
}
