package ex4_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 학생들의 성적을 입력받고,
 * 평균성적 이상인 학생의 번호와
 * 평균 이상인 학생 수를 출력
 * --------------------
 * 학생 수: 3
 * 학생 1의 성적: 90
 * 학생 2의 성적: 75
 * 학생 3의 성적: 84
 * --평균이상인 학생들--
 * => 학생1
 * => 학생3
 * 평균 이상인 학생 수: 2
 */

public class Ex4_work {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//System.out.print("학생 수:");
		bw.write("학생 수:");
		bw.flush();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int avg = 0;
		int sum = 0;
		int cnt = 0;
		for(int i=0 ; i<n ; i++) {
			bw.write("학생 " + (i+1) + "의 성적:");
			bw.flush();
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			
		}
		
		
		avg = sum / n;
		//System.out.println("평균 성적: " + avg);
		bw.write("\n평균 성적: " + avg);
		
		//System.out.println("--평균 이상인 학생들--");
		bw.write("\n--평균 이상인 학생들--");
		
		for(int i = 0 ; i<n ; i++) {
			if(arr[i]>=avg) {
				//System.out.println("=> 학생" + (i+1));
				bw.write("\n=> 학생" + (i+1));
				cnt++;
			}
		}
		bw.write("\n평균 이상인 학생 수: " + Integer.toString(cnt));
		
		bw.flush();
		br.close();
		bw.close();
		
		
	}//main

}
