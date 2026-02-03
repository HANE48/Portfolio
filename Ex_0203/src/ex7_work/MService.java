package ex7_work;

public class MService {
	
	public double point(double money, String s) {
		if(s.equalsIgnoreCase("vip")) {
			return money*0.1;
		}
		if(s.equalsIgnoreCase("gold")) {
			return money*0.05;
		}
		if(s.equalsIgnoreCase("silver")) {
			return money*0.03;
		}
		System.out.println("올바른 등급을 입력해주세요");
		return 0.0;
	}//point
	
	
	
}
