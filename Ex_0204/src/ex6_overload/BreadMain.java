package ex6_overload;

public class BreadMain {

	public static void main(String[] args) {
		
		Bread b = new Bread();
		//메서드 1의 호출결과(주문 정보가 없을경우)
		//빵을 만들었습니다
		
		//메서드 2의 호출결과(수량만 알고있는 경우) -> 수량만큼 출력
		//빵을 만들었습니다.
		//빵을 만들었습니다.
		
		//메서드 3의 호출결과(종류와 수량을 아는 경우)
		//팥빵을 만들었습니다
		//팥빵을 만들었습니다
		//팥빵을 만들었습니다
		//요청하신 3개의 단팥빵을 만들었습니다.
		
		b.makeBread();
		System.out.println("-------------");
		b.makeBread(4);
		System.out.println("-------------");
		b.makeBread(3, "단팥");
		
	}//main

}
