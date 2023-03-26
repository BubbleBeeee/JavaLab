package lab04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z1 {
	public static void main(String[] args) {
		Run();
	}
	
	public static void Run() {
		int[] tab = RandTab();
		int sum = 0;
		
		for (int i : tab)
			sum += i;
		
		System.out.println(Arrays.toString(tab)
		+ "\n\tSuma: " + sum + "\n\tŚrednia: " + (float)sum/tab.length);
	}
	
	public static int[] RandTab() {
		Random random = new Random();
		
		System.out.println("Podaj ilość liczb do wylosowania:");
		int n = InInt();
		
		return random.ints(n,-10, 45).toArray();
	}
	
	public static int InInt() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
