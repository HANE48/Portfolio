package ex1_work;

import java.util.ArrayList;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String[] data = {"apple", "banana", "orange"};
		WordGame wg = new WordGame(list, data);
		
		wg.start();
		Scanner sc = new Scanner(System.in);
		
		//게임 시작
		while(true) {
	
			if(list.size() == 0) {
				System.out.println("clear");
				wg.setPlaying(false);	//스레드 종료
				break;
			}
			
			System.out.println(list);
			System.out.print(">>");
			String in = sc.next();
			
			for(int i=0 ; i<list.size() ; i++) {
				if(in.equalsIgnoreCase(list.get(i))) {
					list.remove(i);
					break;
				}
			}
		}//while
		
		sc.close();
		
	}//main

}
