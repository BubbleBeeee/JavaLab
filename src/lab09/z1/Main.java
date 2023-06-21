package lab09.z1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeSet<String> imiona = new TreeSet<>();
		
		System.out.println("Podaj imiona: ");
		while (true) {
			String imie = scanner.next();
			
			if (imie.equals("-")) break;
			
			imiona.add(imie);
		}
		
		System.out.println("\nUnikalne imiona: ");
		for (String imie : imiona) {
			System.out.println(imie);
		}
	}
}
