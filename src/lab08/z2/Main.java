package lab08.z2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x = 0;
		boolean repeat;
		Scanner scanner = new Scanner(System.in);
		
		do {
			repeat = false;
			System.out.print("Podaj x: ");
			x = scanner.nextInt();
			try {
				System.out.println(x + "! = " + silnia(x));
			} catch (BlednaWartoscDlaSilniException e) {
				System.out.println("Błędna wartość silni");
				repeat = true;
			}
		} while (repeat);
	}
	
	static int silnia(int n) throws BlednaWartoscDlaSilniException {
		if (n < 0)
			throw new BlednaWartoscDlaSilniException();
		
		int s = 2;
		for (int i = 3; i < n; i++) {
			s *= i;
		}
		return s;
	}
}
