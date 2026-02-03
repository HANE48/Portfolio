package ex6_work;

public class Calc {
	
	public int Calculator(int n1, int n2, String op) {
		
		if(op.equals("+")) {
			return n1+n2;
		}
		if(op.equals("-")) {
			return n1-n2;
		}
		if(op.equals("*")) {
			return n1*n2;
		}
		if(op.equals("/")) {
			return n1/n2;
		}
		if(op.equals("%")) {
			return n1%n2;
		}
		System.out.println("잘못된 연산자");
		return -1;
		
	}
	
}
