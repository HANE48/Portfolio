package ex6_work;

public class PrintSquare {
	Square s;
	
	public PrintSquare(int n) {
		s = new Square(n);
		s.makeSquare();	
	}
	
	public void print() {
		for(int i=0 ; i<s.getArrLength() ; i++) {
			for(int j=0 ; j<s.getArrLength() ; j++) {
				System.out.printf("%02d ", s.getArr(j,i));
			}
			System.out.println();
		}
	}
	
}
