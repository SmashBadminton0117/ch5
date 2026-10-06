import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		//Scanner
		Scanner in = new Scanner(System.in);
		int a, b, c;
		int x;
		
		//var: a
		System.out.print("Please enter an integer a: ");
		a = in.nextInt();
		
		//var: b
		System.out.print("Please enter an integer b: ");
		b = in.nextInt();
		
		//var: c
		System.out.print("Please enter an integer c: ");
		c = in.nextInt();
		
		//method
		if (a == 0) {
			System.out.print("a cannot be 0...");
			} else {
				double quadratic = Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a); 
				
				//no roots solution
				if (quadratic < 0) {
					System.out.print("No real roots");
				
				//1 solution
				} else if (quadraitc == 0) {
					System.out.print("solution: " + (-b) / (2 * a));
				
				//2 solutions
				} else {
					 
					System.out.print();
			}
		}
	}
}
