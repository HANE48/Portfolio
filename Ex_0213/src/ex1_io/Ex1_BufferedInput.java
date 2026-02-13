package ex1_io;

import java.io.*;

/*
 * BufferedStream: 입출력의 효율성을 향상시키기 위한 클래스
 * 
 */


public class Ex1_BufferedInput implements Util{

	public static void main(String[] args) throws IOException {
		String path = "D:/Java_KWH/input_test.txt";
		
		File f = new File(path);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		byte[] res = new byte[(int) f.length()];		//파일의 길이는 long타입으로 반환됨
		
		try{
			
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			
			//BufferedInputStream이 읽어온 내용을 byte[]인 res에 저장
			bis.read(res);
			
			//배열 res를 String으로 변환
			String str = new String(res);
			
			System.out.println(str);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			//사용을 마친 스트림은 생성된 역순으로 닫아준다.
			if(bis != null) {
				bis.close();
			}
			if(fis != null) {
				fis.close();
			}
			
		}
		
		
		
		
	}//main

}
