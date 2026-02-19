package ex4_objStream;

import java.io.IOException;
import java.util.Scanner;


public class UserMain {

	public static void main(String[] args) throws IOException{
		User u = new User();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 새로 등록");
		System.out.println("2. 불러오기");
		System.out.print(">>");
		
		int sel = sc.nextInt();
		
		switch(sel) {
			case 1:	//기록
				System.out.print("이름: ");
				u.setName(sc.next());
				
				System.out.print("나이: ");
				u.setAge(sc.nextInt());
				
				System.out.print("전화번호: ");
				u.setTel(sc.next());
				
				InfoWriter iw = new InfoWriter(u);
				iw.writeSave();
				
				break;
			case 2:	//불러오기
				System.out.print("전화: ");
				InfoLoader il = new InfoLoader(sc.next());
				u = il.readSave();
				if(u != null) {
					System.out.println("이름: " + u.getName());
					System.out.println("age: " + u.getAge());
					System.out.println("tel: " + u.getTel());
				}
				
				
				break;
		}//switch
		
		sc.close();
		
	}//main

}
