package ex6_inheritance;

public class AnimalMain {

	public static void main(String[] args) {
		Bear b = new Bear();
		
		System.out.println("--- 곰 ---");
		System.out.println("눈: " + b.getEye());
		System.out.println("코: " + b.getNose());
		System.out.println("다리: " + b.getLeg());
		System.out.println(b.woong);
		
		System.out.println("-------------------");
		
		Elephant e = new Elephant();
		System.out.println("--- 코끼리 ---");
		System.out.println("눈: " + e.getEye());
		System.out.println("코: " + e.getNose());
		System.out.println("다리: " + e.getLeg());
		System.out.println(e.special);
		
		
		//b객체가 animal과 인스턴스(상속관계)가 같은지 확인하는 키워드: instanceof
		if( b instanceof Animal ) {			//상속중이면 참 아니면 거짓을 리턴
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		Snake s = new Snake();
		System.out.println("--- 뱀 ---");
		System.out.println("눈: " + s.getEye());
		System.out.println("코: " + s.getNose());
		System.out.println("다리: " + s.getLeg());
		System.out.println(s.sensor);
		
		
	}//main

}
