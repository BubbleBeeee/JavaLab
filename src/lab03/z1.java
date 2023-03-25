package lab03;

import java.util.Scanner;

public class z1 {
	public static void main(String[] args) {
		Run();
	}
	
	public static void Run() {
		System.out.println("Podaj liczbę studentów:");
		int n = InInt();
		
		System.out.println("Podaj punkty dla studentów:");
		int[] points = new int[n];
		for (int i = 0; i < n; i++) {
			points[i] = InInt();
		}
		
		System.out.println("Średnia punktów: " + Mean(points));
	}
	
	public static float Mean(int[] tab) {
		int sum = 0;
		
		int i = 0;
		while (i < tab.length) {
			sum += tab[i];
			i++;
		}
		
		return (float)sum / tab.length;
	}
	
	public static int InInt() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
