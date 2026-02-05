package ex9_work;

import java.util.Random;

public class Graph {
	
	private int[] arr = new int[100];
	
	public Graph() {
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = new Random().nextInt(10);
		}
	}
	
	public int checkGraph(int n) {
		int cnt = 0;
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] == n) {
				cnt++;
			}
		}//for
		
		return cnt;
	}
	
}
