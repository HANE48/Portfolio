package Ex1_controlStatement;

public class Ex4_else_if {

	public static void main(String[] args) {
		/*
		 else if(다중 if문)
		 if(조건식1){
		 	조건식1이 참일경우 실행되는 영역
		 }
		 else if(조건식2){
		 	조건식2가 참일경우 실행되는 영역
		 }
		 */
		
		int num = 75;
		String str = "";
		
		if(num >= 90) {
			str = "A";
		}else if(num >= 80) {
			str = "B";
		}else if(num >= 70) {
			str = "C";
		}else if(num >= 60) {
			str = "D";
		}else {
			//준비한 조건들이 모두 거짓일 떄 무조건 실행되는 영역
			str = "F";
		}//if
		
		System.out.println(str);
		
	}//main

}
