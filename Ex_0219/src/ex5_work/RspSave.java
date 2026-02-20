package ex5_work;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class RspSave implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private HashMap<String, int[]> map;
	private File f = null;
	public RspSave(File f){
		this.f = f;
	}
	
	public void rspSave() throws IOException, ClassNotFoundException{
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(map);
		
		oos.flush();
		oos.close();
		fos.close();
	}//rspSave
	
	public void setMap(HashMap<String, int[]> map) {
		this.map = map;
	}
	
	
}
