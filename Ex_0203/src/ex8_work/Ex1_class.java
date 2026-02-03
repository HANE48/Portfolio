package ex8_work;

public class Ex1_class {

	public String chkStr(String s) {
		int cnt=1;
		String res = "";
		for(int i=0 ; i<s.length()-1 ; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				cnt++;
			}else {
				res += s.charAt(i);
				res += Integer.toString(cnt);
				cnt = 1;
			}
		}
		
		return res;
	}//chkStr
	
	
}
