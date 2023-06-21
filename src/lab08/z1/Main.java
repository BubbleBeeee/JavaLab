package lab08.z1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean repeat = false;
		double x = 0.0;
		do {
			System.out.print("Podaj liczbe: ");
			Scanner scanner = new Scanner(System.in);
			try {
				x = scanner.nextDouble();
				repeat = false;
			} catch (InputMismatchException e) {
				System.out.println("Należy podać liczbę!");
				repeat = true;
			}
		} while (repeat);
		
		System.out.println("Sqrt(10) = " + pierwiastek(x));
	}
	
	static double pierwiastek(double x) throws IllegalArgumentException {
		if (x < 0)
			throw new IllegalArgumentException("Nie mozna pierwiastkowac liczb ujemnych");
		
		return Math.sqrt(x);
	}
}
