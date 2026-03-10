package boj1780;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] arr;
	static int m1 = 0;
	static int ze = 0;
	static int one = 0;
	
	static void divide(int row, int col, int size) {
		int now = arr[row][col];
		boolean flag = true;
		out : for(int i=row ; i<row + size ; i++) {
			for(int j=col ; j<col + size ; j++) {
				if(arr[i][j] != now) {
					flag = false;
					break out;
				}
			}
		}
		
		if(flag) {			//전부 같은 숫자일 경우
			if(now == 0) {
				ze++;
			}else if(now == 1) {
				one++;
			}else {
				m1++;
			}
		}else {				//다를 경우 3*3으로 분할
			divide(row, col, size/3);							//왼쪽 위
			divide(row, col + size/3, size/3);					//위에 가운데
			divide(row, col + size/3 * 2 , size/3);				//오른쪽 위
			divide(row + size/3, col, size/3);					//왼쪽 가운데
			divide(row + size/3, col+size/3, size/3);			//정 가운데
			divide(row + size/3, col+size/3*2, size/3);			//오른쪽 가운데
			divide(row + size/3 * 2, col, size/3);				//왼쪽 아래
			divide(row + size/3 * 2, col + size/3, size/3);		//가운데 아래
			divide(row + size/3 * 2, col + size/3*2, size/3);	//오른쪽 아래
		}
		
		return;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		for(int i=0 ; i<n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<n ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}//for
		divide(0, 0, n);
		System.out.println(m1);
		System.out.println(ze);
		System.out.println(one);
		
		
	}//main

}
