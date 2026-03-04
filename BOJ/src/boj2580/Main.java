package boj2580;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//0 3 6
//3 
//6
//3*3확인할 시작지점


public class Main {
	
	public static int[][] arr;
	public static StringBuilder sb = new StringBuilder();
	
	public static void sudoku(int row, int col) {
		
		if(col == 9) {		//열의 끝까지 갔을 경우 다음 행 첫 열부터 다시 시작
			sudoku(row+1, 0);
			return;
		}
		
		if(row == 9) {		//행의 끝까지 갔을경우 다 채웠으므로 프로그램 종료
			for(int i=0 ; i<arr.length ; i++) {
				for(int j=0 ; j<arr[i].length ; j++) {
					sb.append(arr[i][j]).append(" ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);
		}
		
		if(arr[row][col] == 0) {			//빈값일 경우 채워야함
			for(int i=1 ; i<= 9 ; i++) {	//1~9까지 돌며 가로, 세로 3*3의 가능한 값을 찾아 넣음
				if(possibility(row, col, i)) {
					arr[row][col]=i;
					sudoku(row, col+1);
				}
			}
			
			arr[row][col] = 0;
			return;
		}
		sudoku(row, col + 1);			//값이 있을경우 다음으로 넘어감
		
	}//sudoku
	
	private static boolean possibility(int row, int col, int value) {
		for(int i=0 ; i<9 ; i++) {		//열을 확인해 겹치는게 있으면 false를 반환
			if(arr[row][i] == value) {
				return false;
			}
		}
		
		for(int i=0 ; i<9 ; i++) {		//행을 확인해 겹치는게 있으면 false를 반환
			if(arr[i][col] == value) {
				return false;
			}
		}
		
		int set_row = (row/3) * 3;		//행을 0 3 6 으로 초기화
		int set_col = (col/3) * 3;		//열을 0 3 6으로 초기화
		
		for(int i=set_row ; i<set_row + 3 ; i++) {	
			for(int j = set_col ; j<set_col + 3 ; j++) {
				if(arr[i][j] == value) {	//3*3중에 겹치는게 있으면 false를 반환
					return false;
				}
			}
		}//for
		
		return true;		//전부 겹치지 않을경우 true를 반환
		
	}//possibility

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = 9;
		arr = new int[n][n];
		
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<n ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	
		sudoku(0, 0);
		
	}//main

}
