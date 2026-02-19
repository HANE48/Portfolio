package ex5_work;

import java.io.*;
import java.util.HashMap;

public class RspLoad {
	private File f = null;
	private HashMap<String, int[]> map = new HashMap<String, int[]>();
	
	public RspLoad(File f){
		this.f = f;
	}
	
	public RspLoad() {
		
	}
	
	@SuppressWarnings("unchecked")
	public void load() throws IOException, ClassNotFoundException{
		FileInputStream fis = null;;
		ObjectInputStream ois = null;
		
		if(!f.exists() || f.length()==0) {
			map = new HashMap<String, int[]>();
		}else {
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			map = (HashMap<String, int[]>) ois.readObject();
			ois.close();
			fis.close();
		}
		
	}
	
	
	public HashMap<String, int[]> getMap() {
		return map;
	}
	public void setMap(HashMap<String, int[]> map) {
		this.map = map;
	}
	
	public int[] getRec(String id) {
		if(map == null ) {
			map = new HashMap<String, int[]>();
		}
		if(!map.containsKey(id)) {
			int[] arr = {0, 0, 0};
			map.put(id, arr);
		}
	
		return map.get(id);
	}
	
	public void updateRec(String id, int[] arr) {
		if(map == null ) {
			map = new HashMap<String, int[]>();
		}
		
		if(map.containsKey(id)) {
			map.remove(id);
		}
		map.put(id, arr);
	}
}
