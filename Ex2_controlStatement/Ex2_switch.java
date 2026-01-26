package Ex2_controlStatement;

public class Ex2_switch {

	public static void main(String[] args) {
		char str = 'C';
		String res = "";
		
		switch(str) {
		
		case 'A':
			res = "90~100";
			break;
			
		case 'B':
			res = "80~89";
			break;
			
		case 'C':
			res = "70~79";
			break;
			
		case 'D':
			res = "60~69";
			break;
			
		case 'F':
			res = "0~59";
			break;
		
		default:
			res = "올바른 성적범위가 아닙니다";
			break;
		}//case
		
		System.out.println(res);
	}//main

}
