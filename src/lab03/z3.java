package lab03;

import java.util.Scanner;

public class z3 {
	public static void main(String[] args) {
		Run();
	}
	
	public static void Run() {
		int[] tab = InTab();
		int sum = 0;
		
		for (int i : tab) {
			if (i % 2 == 0)
				sum += i;
		}
		
		System.out.println("Suma liczb parzystych: " + sum);
	}
	
	public static int[] InTab() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ile liczb?");
		int n = scanner.nextInt();
		
		int[] tab = new int[n];
		System.out.println("Podaj liczby:");
		
		for (int i = 0; i < n; i++) {
			tab[i] = scanner.nextInt();
		}
		
		return tab;
	}
}
