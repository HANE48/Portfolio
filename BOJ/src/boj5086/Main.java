package boj5086;

/*
 * 4 × 3 = 12이다.
 * 이 식을 통해 다음과 같은 사실을 알 수 있다.
 * 3은 12의 약수이고, 12는 3의 배수이다.
 * 4도 12의 약수이고, 12는 4의 배수이다.
 * 두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
 * 1)첫 번째 숫자가 두 번째 숫자의 약수이다. ==> factors
 * 2)첫 번째 숫자가 두 번째 숫자의 배수이다. ==>multiple
 * 3)첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.  ==>neither
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
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) {
				bw.flush();
				bw.close();
				br.close();
				System.exit(0);
			}
			if( a%b == 0 ) {
				bw.write("multiple\n");
				continue;
			}else if(b%a==0) {
				bw.write("factor\n");
				continue;
			}
			else {
				bw.write("neither\n");
				continue;
			}
			
		}
		
		
		
	}//main

}
