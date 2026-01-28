package ex2_label;

/*
 * label: 한번에 2개 이상의 반복문을 제어하기 위해 반복문에 붙이는 이름표
 * 
 */

public class Ex1_label {

	public static void main(String[] args) {
		out : for(int i=1 ; i<=3 ; i++) {	//out : 바깥쪽 for문에 out이라고 이름을 붙임
			
			for(int j=1 ; j<=10 ; j++) {
				
				if(j%2 == 0) {
					break out;		//break out == out이라는 이름의 반복문을 끝냄
				}
				
				System.out.println(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("------------------------");
		
		name : for( int i=1 ; i<=3 ; i++) {
			switch(i) {
			case 1:
				System.out.println("i == 1");
				break name;
				
			case 2:
				System.out.println("i == 2");
				break;
				
			case 3:
				System.out.println("i == 3");
				break;
			}//switch
		}//for
	}//main

}
