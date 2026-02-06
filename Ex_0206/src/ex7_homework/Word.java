package ex7_homework;

import java.util.Random;
import java.util.Scanner;

public class Word {
	private StringBuilder sb;
	private StringBuilder rb;
	int[] arr = new int[91];
	
	public StringBuilder reMake(StringBuilder sb) {
		this.sb = sb;
		int count = sb.length();
		
		for(int i=0 ; i<sb.length() ; i++) {
			arr[sb.charAt(i)]++;
		}
		
		rb = new StringBuilder();
		while(true) {
			int a = new Random().nextInt('Z' - 'A' + 1)+'A';
			if(count==0) {
				break;
			}
			
			if(arr[a]>0) {
				arr[a]--;
				rb.append(Character.toString(a));
				count--;
			}
		}//while
		
		return rb;
	}
	
	public void startGame(StringBuilder rb, Scanner sc)
	{
		System.out.println("문제: " + rb);
		while(true) {
			System.out.print(">>");
			String s = sc.next();
			
			if(s.equalsIgnoreCase(sb.toString())) {
				System.out.println(s + " 정답!");
				break;
			}else {
				System.out.println(s + " 오답...");
			}
			
		}
	}
	
}
