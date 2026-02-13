package ex1_io;

import java.io.*;

public class Ex5_BufferedOutput {

	public static void main(String[] args) throws IOException{
		
		String path = Util.PATH + "buffOut.txt";
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try{
			fos = new FileOutputStream(path);
			bos = new BufferedOutputStream(fos);
			
			String msg = "im BufIutStream's Example";
			bos.write(msg.getBytes());
			//flush() 메서드를 통해서 물리적으로 기록을 함
			bos.flush();
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			//스트림 닫는거는 생성한 역순으로 닫기
			//fos.close();
			if(bos != null) {
				bos.close();
			}
			
			if(fos != null) {
				fos.close();				
			}
		}
		
	}//main

}
