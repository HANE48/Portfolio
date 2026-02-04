package ex1_work;

import java.util.Scanner;

/* 종료를 선택하기 전까지 계속 반복하는 코드
 * 1. 입   금
 * 2. 출   금
 * 3. 잔액 확인
 * 4. 종   료 
 * >> 1
 * --입  금--
 * 입금액: 1000
 * 입금성공
 * ---------
 * 1. 입   금
 * 2. 출   금
 * 3. 잔액 확인
 * 4. 종   료 
 * >> 2
 * --출  금--
 * 출금액: 500
 * 출금성공
 * ---------
 * 1. 입   금
 * 2. 출   금
 * 3. 잔액 확인
 * 4. 종   료 
 * >> 3
 * --잔액확인--
 * 현재 잔액: 500
 * ---------
 * 1. 입   금
 * 2. 출   금
 * 3. 잔액 확인
 * 4. 종   료 
 * >> 4
 */

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu m = new Menu();
		Deposit d = new Deposit();
		Withdraw w = new Withdraw();
		CheckAccount c = new CheckAccount();
		int account = 0;
		
		
		while(true) {
			int n = m.getMenu(sc);
			
			if(n == 1) {		//입금
				account = d.deposit(sc);
			}else if(n == 2) {	//출금
				account = w.withdraw(sc, account);
			}else if(n == 3) {	//잔액 확인
				c.checkAccount(account);
			}else if(n == 4) {	//종료
				System.exit(0);
			}else {				//기타값이 입력된 경우
				System.out.println("올바른 번호를 입력해주세요.");
			}
			System.out.println("----------");
			
		}//while
		
		
		
	}//main

}
