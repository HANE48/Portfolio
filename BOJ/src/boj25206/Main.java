package boj25206;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!

	치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
	
	전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
	
	인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.
	
	A+	4.5
	A0	4.0
	B+	3.5
	B0	3.0
	C+	2.5
	C0	2.0
	D+	1.5
	D0	1.0
	F	0.0
	P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.
	
	과연 치훈이는 무사히 졸업할 수 있을까?
 */

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Double save, sum=0.0, avg, average=0.0;
		
		for(int i=0 ; i<20 ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			avg = Double.parseDouble(st.nextToken());
			String score = st.nextToken();
			switch(score) {
			case "A+":
				save = 4.5;
				break;
			case "A0":
				save = 4.0;
				break;
			case "B+":
				save = 3.5;
				break;
			case "B0":
				save = 3.0;
				break;
			case "C+":
				save = 2.5;
				break;
			case "C0":
				save = 2.0;
				break;
			case "D+":
				save = 1.5;
				break;
			case "D0":
				save = 1.0;
				break;
			case "F":
				save = 0.0;
				break;
			default:			//p인 경우
				save = -1.0;
				break;
			}//switch
			if(save != -1.0) {
				sum += avg;
				average += save * avg;
			}
			
		}//for
		
		bw.write(Double.toString(average/sum));
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
