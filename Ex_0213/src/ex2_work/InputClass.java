package ex2_work;

import java.util.ArrayList;
import java.util.Scanner;

public class InputClass implements Runnable{

	private ThreadList threadList;
	
	public InputClass(ThreadList threadList) {
		this.threadList = threadList;
	}

	public void run() {
		//System.out.println("t2 is started");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			ArrayList<String> list = threadList.getList();	// ThreadList의 같은 리스트를 참조
			
			// 리스트 출력
			System.out.print("[");
			for(String s: list) {
				System.out.print(s + ", ");
			}
			System.out.println("]");
			System.out.print(">> ");
			String str = sc.next();
			
			// 입력한 단어 삭제
			for(int i=0 ; i<list.size() ; i++) {
				if(str.equals(list.get(i))) {
					list.remove(i);
					i--;	// 삭제 후 다음 인덱스 놓치지 않도록
				}
			}
			
			if(list.size() == 0) {
				System.out.println("모든 단어를 제거했습니다. 프로그램을 종료합니다.");
				break;
			}
			
		}//while
		
		sc.close();
	}
	
	
	
	
}
