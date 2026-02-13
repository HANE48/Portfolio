package ex1_io;

import java.io.PrintStream;

public class Ex3_output {

	public static void main(String[] args) {
		//화면에 데이터를 출력하도록 하는 클래스
		PrintStream ps = null;
		ps = System.out;
		
		ps.write('A');
		ps.write('B');
		ps.flush();
		ps.close();
		
		
	}//main

}
