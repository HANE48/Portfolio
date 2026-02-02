package ex1_String;

/*
 * String은 두 가지 특징이 있다.
 * 1) 객체 생성법이 두 가지(암시적, 명시적).
 * 2) 한 번 생성된 문자열의 내용은 변하지않는다(불변의 특징).
 */

public class Ex1_String {

	public static void main(String[] args) {
		
		//암시적 객체생성
		String s1 = "abc";					//같은 주소의 문자열을 참조해서 사용
		String s2 = "abc";					//s1 s2를 비교하면 같다고 나옴
		
		//명시적 객체생성
		String s3 = new String("abc");		//new라는 키워드가 나오면 heap영역에 메모리를 새로 할당받음 그래서 같은 문자열도 주소가 달라서 다름
		String s4 = new String("abc");
		
		
		
		if(s3 != s4) {						//연산자를 사용하면 값이 아닌 문자열의 주소가 같은지를 비교함
			System.out.println("다릅니다.");
		}else {
			System.out.println("같습니다.");
		}
		
		if(s1.equals(s3)) {					//equals 메서드를 이용해 문자열끼리 비교가 가능함
			System.out.println("값이 같습니다.");
		}
		
		String str = "a";
		System.out.println(str);
		
		str += "bc";
		
		System.out.println(str);
		System.out.println(s2);
		
	}

}
