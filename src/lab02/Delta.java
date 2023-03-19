package lab02;

import java.util.Scanner;

public class Delta {
	public static void main(String[] args) {
		Solve();
	}
	
	public static void Solve() {
		System.out.println("Podaj a, b, c: ");
		double a = InDouble();
		double b = InDouble();
		double c = InDouble();
		
		if (a == 0) {
			System.out.println("To nie jest równanie kwadratowe!");
			System.exit(0);
		}
		
		double delta = b*b - 4*a*c;
		
		if (delta < 0) {
			System.out.println("Brak rozwiązań!");
		}
		else {
			double sqrt = Math.sqrt(delta);
			
			double x1 = (-b - sqrt) / (2 * a);
			double x2 = (-b + sqrt) / (2 * a);
			
			if (delta == 0) {
				System.out.println("Jedno rozwiązanie:\n" + x1);
			}
			else {
				System.out.println("Dwa rozwiązania:\n" + x1 + "\n" + x2);
			}
		}
	}
	
	public static double InDouble() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}
}
