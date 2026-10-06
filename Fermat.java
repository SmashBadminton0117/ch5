import java.util.Scanner;

public class Fermat {
	public static void main(String[] args) {
		//Scanner
		Scanner in = new Scanner(System.in);
		
		//Variables
		int a, b, c, n;
		
		//var: a
		System.out.print("a = ");
		a = in.nextInt();
		
		//var: b
		System.out.print("b = ");
		b = in.nextInt();
		
		//var: c
		System.out.print("c = ");
		c = in.nextInt();
		
		//var: n
		System.out.print("n = ");
		n = in.nextInt();
		
		double nthPowerA = Math.pow(a, n); //a^n 
		double nthPowerB = Math.pow(b, n); //b^n
		double nthPowerC = Math.pow(c, n); //c^n
		
		double fermatsTheorem = nthPowerA + nthPowerB;
		
		if (n > 2 && fermatsTheorem == nthPowerC) {
			System.out.print("Holy smokes, Fermat was wrong!");
		} else {
			System.out.print("No, that doesn't work.");
		}
	}
}
