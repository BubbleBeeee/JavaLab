package lab02;

import java.util.Scanner;

public class zd6 {
	public static void main(String[] args) {
		while (true) {
			if (InInt() < 0) break;
		}
	}
	
	public static int InInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbę:");
		return scanner.nextInt();
	}
}
