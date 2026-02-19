package ex4_objStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InfoLoader {

	private String tel;
	private User u;
	
	public InfoLoader(String tel) {
		this.tel = tel;
	}
	//전화번호를 기반으로 user정보를 읽어옴
	public User readSave() throws IOException {
		String path = 
				"D:/Java_KWH/IOTest/User/" 
				+ tel + "/save.sav";
		
		File f = new File(path);
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				
				u = (User) ois.readObject();	//리턴타입이 Object이므로 쓰려는 객체로 캐스팅 해줘야한다/
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				if(ois != null)
					ois.close();
				if(fis != null)
					fis.close();
			}//try-catch
			
		}else {
			System.out.println("가져올 정보가 없습니다....");
		}//if-else
		
		return u;
		
	}//readSave
	
	
}
