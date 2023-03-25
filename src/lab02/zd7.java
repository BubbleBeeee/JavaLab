package lab02;

import java.util.Arrays;
import java.util.Scanner;

public class zd7 {
	public static void main(String[] args) {
		Run();
	}
	
	public static void Run() {
		int[] tab = InputTab();
		Sort(tab);
	}
	
	public static void Sort(int[] tab) {
		int len = tab.length;
		
		for (int i = 1; i < len; i++) {
			for (int j = i; j > 0; j--) {
				if (tab[j-1] <= tab[j]) break;
				
				int tmp = tab[j-1];
				tab[j-1] = tab[j];
				tab[j] = tmp;
			}
		}
		
		System.out.println(Arrays.toString(tab));
	}
	
	public static int[] InputTab() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ile liczb?");
		int n = scanner.nextInt();
		
		System.out.println("Podaj " + n + " liczb:");
		int[] tab = new int[n];
		
		for (int i = 0; i < n; i++) {
			tab[i] = scanner.nextInt();
		}
		
		System.out.println();
		return tab;
	}
}
