package ex4_objStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class InfoWriter {

	private User u;
	
	public InfoWriter( User u ) {
		this.u = u;
	}
	
	//User클래스의 정보를 기록
	public void writeSave() throws IOException {
		String path = 
				"D:/Java_KWH/IOTest/User/" 
				+ u.getTel().trim() + "/save.sav";
		
		File dir1 = new File("D:/Java_KWH/IOTest/User/");
		if(!dir1.exists()) 
			dir1.mkdirs();
		
		File dir2 = new File(dir1, u.getTel().trim());
		if(!dir2.exists()) {
			dir2.mkdirs();
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			//ObjectOutputStream을 통해 
			//user객체를 통째로 저장
			oos.writeObject(u);		//직렬화가 안되어있어 발생하는 문제
			System.out.println("save complate!!!");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("save fail....");
			e.printStackTrace();
		}finally {
			if(oos != null) 
				oos.close();
			
			if(fos != null)
				fos.close();
		}	
	}//writeSave
	
	
	
	
	
}
