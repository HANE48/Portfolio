package ex2_work;


import java.util.*;

public class ThreadList implements Runnable {	// 3초마다 리스트에 단어 추가
	
	private ArrayList<String> list = new ArrayList<String>();
	private String[] arr = { "apple", "orange", "grape", "pear"	};
	
	public void run(){
		//System.out.println("t1 is started");
		
		// 처음 한 번 추가
		list.add(arr[new Random().nextInt(arr.length)]);
		
		// 계속 3초마다 추가 (리스트가 비면 종료)
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(list.size() == 0) {
				System.out.println("게임을 종료합니다.");
				return;
			}
			
			list.add(arr[new Random().nextInt(arr.length)]);
		}//while
		
	}//run

	// 같은 리스트 인스턴스를 공유하도록 그대로 반환
	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	
	
	
	
}

