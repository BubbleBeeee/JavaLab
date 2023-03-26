package lab03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z4 {
	public static void main(String[] args) {
		Run();
	}
	
	public static void Run() {
		int[] tab = RandTab();
		
		System.out.println(Arrays.toString(tab));
		
		int sum = 0;
		
		for (int i : tab) {
			if (i % 2 == 0)
				sum += i;
		}
		
		System.out.println("Suma liczb parzystych: " + sum);
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
