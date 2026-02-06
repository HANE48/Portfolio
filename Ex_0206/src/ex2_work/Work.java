package ex2_work;

public class Work {

	public int GCD(int n, int m) {
		if(n%m==0) {
			return m;
		}
		else {
			return GCD(m, n%m);
		}
	}
	
}
