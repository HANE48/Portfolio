package ex5_work;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//id를 입력하고 시작
//id: aaa
//0W 0D 0L
//-------------
//가위(s), 바위(r), 보(p): r
//당신이 이겼습니다.
//1W 0D 0L
//다시 하시겠습니까? Y, N: n
//게임을 종료합니다.

public class RspMain {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String[] rsp = {"s", "r", "p"};
		String path = "D:/Java_KWH/work/Save.txt";
		File f = new File(path);
		Scanner sc = new Scanner(System.in);
		RspSave rs = new RspSave(f);
		RspLoad rl = new RspLoad(f);
		boolean flag = true;
		
		rl.load();
		
		System.out.print("ID: ");
		int[] arr = rl.getRec(sc.next());
		System.out.println(arr[0] + "W " + arr[1] + "D " + arr[2] + "L");
		
		while(flag) {
			System.out.println("--------------------------");
			System.out.print("가위(s), 바위(r), 보(p): ");
			String sel = sc.next();		//r s p 중 하나를 입력받음
			String res = rsp[new Random().nextInt(3)];
			
			if(sel.equals("r") && res.equals("r") 
					|| sel.equals("s") && res.equals("s") 
					|| sel.equals("p") && res.equals("p")) {	//비긴경우
				
				arr[1]++;
				System.out.println("비겼습니다.");
				
			}else if(sel.equals("r") && res.equals("s") 
					|| sel.equals("s") && res.equals("p")
					|| sel.equals("p") && res.equals("r") ) {		//이긴경우
				
				arr[0]++;
				System.out.println("당신이 이겼습니다!!");
				
			}else {		//진경우
				arr[2]++;
				System.out.println("당신은 졌습니다...");
			}
			
			System.out.println(arr[0] + "W " + arr[1] + "D " + arr[2] + "L");
			
			System.out.print("다시 하시겠습니까? Y/N: ");
			String re = sc.next();
			if(re.equalsIgnoreCase("N")) {
				flag = false;
			}
		}//while
		
		rs.setMap(rl.getMap());
		rs.rspSave();
		sc.close();
		
		
	}//main

}
