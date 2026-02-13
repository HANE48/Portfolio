package ex1_io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4_FileOutput {

	public static void main(String[] args) {
		String path = Util.PATH + "fileOutput.txt";
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(path, true);
			String msg = "real 두번째 줄\n ";
			
			//문자열 msg를 바이트배열로 전환하는 단계
			byte[] w = msg.getBytes();
			fos.write(w);
			fos.flush();
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}//main

}
