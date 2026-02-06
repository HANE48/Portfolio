package ex5_work;

public class Work {

	public boolean reverse(String ori) {
		String s = "";
		
		for(int i=ori.length()-1 ; i>=0 ; i--) {
			s += ori.charAt(i);
		}//for
		
		return s.equals(ori);
		
	}//reverse
	
}
