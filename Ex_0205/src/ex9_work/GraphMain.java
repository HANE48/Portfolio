package ex9_work;

/*
 * 0 ~ 9사이의 난수를 100개 생성
 * 각 숫자의 갯수를 그래프화
 * ----------------------
 * 8732420354203472047019375....//난수 100개 출력 필요 X
 * 0의 갯수: ########## 12
 * 1의 갯수: ########## 9
 * 
 * 		.......
 * 9의 갯수: ### 3
 * 
 */

public class GraphMain {

	public static void main(String[] args) {
		Graph g = new Graph();
		int sum =0;
		for(int i=0 ; i<10 ; i++) {
			System.out.print(i + "의 갯수: ");
			int cnt = g.checkGraph(i);
			for(int j=0 ; j<cnt ; j++) {
				System.out.print("#");
			}
			System.out.println(" " + cnt);
			sum += cnt;
		}
		
		System.out.println(sum);
	}//main

}
