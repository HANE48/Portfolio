package ex2_work;


/*
 * 3초마다 단어가 하나씩 추가되며
 * 그 안에 단어를 정확히 입력하면 리스트의 단어가 삭제됨
 */

public class Main {

	
	public static void main(String[] args) {
		
		ThreadList threadList = new ThreadList();
		Runnable makeList = threadList;
		Runnable deleteList = new InputClass(threadList);
		
		Thread t1 = new Thread(makeList);
		Thread t2 = new Thread(deleteList);

		t1.start();
		t2.start();
		
		
	}//main

}
