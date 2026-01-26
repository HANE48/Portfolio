package Ex1_controlStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3_if_else {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//변수 age에 나이를 대입하고
		//30 이상이면 '드실만큼 드셨군요'를
		//아니면 '조금 더드셔도 됩니다'를 출력하는 if문을 구현
		//마지막으로 '감사합니다' 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int age = Integer.parseInt(br.readLine());
		if(age>=30) {
			System.out.println("드실만큼 드셨군요");
		}
		else {
			System.out.println("조금 더드셔도 됩니다");
		}
		System.out.println("감사합니다.");
		
		System.out.println("------------------");
		//위의 코드를 삼항 연산자로 변환하시오
		String result = age>=30 ? "드실만큼 드셨군요" : "조금 더 드셔도 됩니다.";
		System.out.println(result);
	}//main

}
