package boj9063;

/*
 * 임씨의 이름이 새겨진 옥구슬의 위치 N 개가 주어질 때에, 
 * 임씨에게 돌아갈 대지의 넓이를 계산하는 프로그램을 작성하시오. 
 * 단, 옥구슬의 위치는 2 차원 정수 좌표로 주어지고 옥구슬은 같은 위치에 여러 개가 발견될 수도 있으며, 
 * x 축의 양의방향을 동쪽, y 축의 양의방향을 북쪽이라고 가정한다. 
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int minx=10001;
		int miny=10001;
		int maxx=-10001;
		int maxy=-10001;
		int sum = 0;
		
		
		while(n-->0) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(x>maxx) {
				maxx=x;
			}
			if(x<minx) {
				minx=x;
			}
			
			if(y>maxy) {
				maxy=y;
			}
			if(y<miny) {
				miny=y;
			}
		}//while
		
		sum = (maxx-minx) * (maxy-miny);
		bw.write(Integer.toString(sum));
		bw.flush();
		br.close();
		bw.close();
		
		
	}//main

}
