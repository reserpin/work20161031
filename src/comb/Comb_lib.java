package comb;

public class Comb_lib {
	public int getFactorial(int n){
		if(n == 1){
			return 1;
		}
		n = n*getFactorial(n-1); 
		return n;
	}
}
