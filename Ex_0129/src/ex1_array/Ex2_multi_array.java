package ex1_array;

/*
 * 
 */

public class Ex2_multi_array {

	public static void main(String[] args) {
		
		String[][] sArr = new String[2][3];		//String배열은 null로 초기화됨
		
		sArr[0][0] = "영희";
		sArr[0][1] = "100";
		sArr[0][2] = "80";
		
		sArr[1][0] = "철수";
		sArr[1][1] = "78";
		sArr[1][2] = "99";
		
		for(int i = 0 ; i<sArr.length ; i++) {
			for(int j=0 ; j<sArr[i].length ; j++) {
				System.out.print(sArr[i][j] + " ");
			}//inner
			System.out.println();
		}//outer
		
		
	}//main

}
