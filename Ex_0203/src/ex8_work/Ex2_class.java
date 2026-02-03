package ex8_work;

public class Ex2_class {
	
	public String chk( String s) {
		int[] arr = new int[123];
		String res = "";
		for(int i=0 ; i<s.length() ; i++) {
			arr[s.charAt(i)]++;			
		}//for
		
		for(int i=97 ; i<=122 ; i++) {
			if(arr[i] == 0) {
				continue;
			}
			res += Character.toString(i)+arr[i];
		}
		
		return res;
	}//chk
	
}
