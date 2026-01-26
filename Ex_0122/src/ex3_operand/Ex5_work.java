package ex3_operand;

public class Ex5_work {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		char res = ++a >= b || (a-3) + (b-5) <= b && (b+1)-b >= 0 && (a+=b) - (a%b)>10 ? 'O' : 'X';
		//a=11 b=12 F || a-3=8 b-5=7 \ <= 12 F == X
		System.out.println(res);
	}// main

}
