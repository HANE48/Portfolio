package Ex2_controlStatement;

import java.util.Scanner;

public class Ex1_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* switch 문
		 switch(비교값){
		 	case 조건값1:
		 		비교값과 조건1이 같을 때 실행되는 영역
		 		break;
		 	case 조건값2:
		 		비교값과 조건2가 같을 때 실행되는 영역
		 		break;
		 }
		 
		 */
		System.out.print("1 ~ 3사이의 값: ");
		int n=sc.nextInt();
		sc.close();
		switch(n) {
		
		case 1://조건값
			System.out.println("1. 게임시작");
			break;//switch문을 완전히 빠져나가는 키워드 
			
		case 2:
			System.out.println("2. 게임소개");
			break;
			
		case 3:
			System.out.println("3. 만든사람");
			break;
			
		default:	//비교값과 일치하는 조건이 하나도 없을 때 반드시 실행되는 영역
			System.out.println("올바른 값을 입력하세요");
			break;
			
			
		
		}//switch
	
	}//main
	
}
