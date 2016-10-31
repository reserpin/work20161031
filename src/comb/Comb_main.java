package comb;
import java.util.Scanner;

public class Comb_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("nuber:s > ");
		int s = Integer.parseInt(scan.next());
		int r = s+1;
		while(r > s){
			System.out.print("nuber:r > ");
			r = Integer.parseInt(scan.next());
			if(r>s)System.out.println("r‚Í‚“ˆÈ‰º‚É‚µ‚Ä‚­‚¾‚³‚¢");
		}
		Comb_lib clib = new Comb_lib();
		int r2 = clib.getFactorial(r);
		int s2 = clib.getFactorial(s);
		int rs = clib.getFactorial(s-r);
		int ans = s2/r2/rs;
		System.out.println(s+"C"+r+"="+ans);
	}

}
