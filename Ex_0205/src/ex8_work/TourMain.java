package ex8_work;

import java.util.Scanner;

/*
 * 몇 명이랑 여행을 가는지를 입력받음
 * 
 * 관광객 수:2
 * 관광객 등록
 * 1. 이름: hong
 * 1. 나이: 20
 * --------
 * 2. 이름: kim
 * 2. 나이: 21
 * -----------
 * 1. 관광객 정보
 * 2. 목적지 변경
 * 3. 종    료
 * >> 1
 * 1. 이름: hong
 * 1. 나이: 20
 * 1. 목적지: bulguk
 * ------------
 * 2. 이름: kim
 * 2. 나이: 21
 * 2. 목적지: bulguk
 * ------------
 * 1. 관광객 정보
 * 2. 목적지 변경
 * 3. 종    료
 * >> 2
 * -----------
 * 어디로 변경 : seok
 * -----------
 * 1. 관광객 정보
 * 2. 목적지 변경
 * 3. 종    료
 * >>1
 * ----------
 * 1. 이름: hong
 * 1. 나이: 20
 * 1. 목적지: seok
 * ------------
 * 2. 이름: kim
 * 2. 나이: 21
 * 2. 목적지: seok
 */

public class TourMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("관광객 수: ");
		int n = sc.nextInt();
		System.out.println("관광객 등록");
		System.out.println("-----------");
		People p = new People(n);
		Menu m = new Menu();
		
		
		for(int i=0 ; i<n ; i++) {
			System.out.print( (i+1) +". 이름: ");
			String name = sc.next();
			System.out.print((i+1) + ". 나이: ");
			int age = sc.nextInt();
			System.out.println("-----------");
			p.registerPeople(name, age, i);
		}
		
		while(true) {
			int a = m.getMenu(sc);
			if(a == 1) {
				for(int i=0 ; i<n ; i++) {
					System.out.println((i+1) + ". 이름: " + p.getPeopleName(i));
					System.out.println((i+1) + ". 나이: " + p.getPeopleAge(i));
					System.out.println((i+1) + ". 목적지: " + People.destiy);
					System.out.println("-----------");
				}
			}else if(a == 2) {
				System.out.print("변경할 목적지 입력: ");
				People.destiy = sc.next();
			}else {
				break;
			}
			
			
		}
		
		
		
		
	}//main

}
