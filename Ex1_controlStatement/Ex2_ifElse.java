package Ex1_controlStatement;

public class Ex2_ifElse {

	public static void main(String[] args) {
		//if-else
		//if(조건식){
		//	조건식이 참일 경우 실행되는 영역
		//}
		//else{
		//	조건식이 거짓을 경우 실행되는 영역
		//}
		
		int n = 49;
		String str = "";
		
		if(n++ >= 50) {
			str = "50이상의 수";
		}
		else {
			str = "50미만의 수";
		}
		
		System.out.println(str);
	}//main

}
