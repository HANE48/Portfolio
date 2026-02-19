package ex1_work;

import java.util.List;
import java.util.Random;

public class WordGame extends Thread{
	
	private List<String> arr;
	private String[] data;
	private boolean isPlaying = true;
	private Random rand;
	
	
	public WordGame(List<String> list, String[] data ) {	//메인과 워드게임간 동기화; 둘이 같은 주소를 공유함
		rand = new Random();
		this.arr = list;
		this.data = data;
	}
	
	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	
	
	@Override
	public void run() {
		while(isPlaying) {
			int random = rand.nextInt(data.length);
			arr.add(data[random]);
			try {
				Thread.sleep(3000);
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			
		}//while
		
	}//run

}
