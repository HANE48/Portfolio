package ex6_work;

public class Square {
	
	private int[][] arr;
	
	public Square(int n) {
		arr = new int[n][n];
	}
	
	public void makeSquare() {
		int x = arr.length/2;
		int y = 0;
		int cnt = 1;
		
		while(true) {
			if(cnt == Math.pow(arr.length, 2)+1) {
				break;
			}
			
			int copx = x;
			int copy = y;
			int chkx = 0;
			int chky = 0;
			
			arr[y--][x++] = cnt++;

			
			if(y<0) {
				y = arr.length-1;
				chky++;
			}
			if(x >= arr.length) {
				x = 0;
				chkx++;
			}
			
			if(arr[y][x] > 0) {
				x--;
				y+=2;
				if(chkx>0) {
					x = copx;
				}
				if(chky>0) {
					y = copy+1;
				}
				
				if(y >= arr.length) {
					y=0;
				}
			}
		}//while
		
	}//makeSquare
	
	
	public int getArr(int x, int y) {
		return arr[y][x];
	}
	
	public int getArrLength() {
		return arr.length;
	}
	
}
