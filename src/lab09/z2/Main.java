package lab09.z2;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeMap<String, String> pary = new TreeMap<>();
		System.out.println("Podaj pary:");
		
		while (true) {
			String imie1 = scanner.next();
			String imie2 = scanner.next();
			
			if (imie1.equals("-") || imie2.equals("-")) break;
			
			pary.put(imie1, imie2);
			pary.put(imie2, imie1);
		}
		
		System.out.println();
		
		System.out.print("Podaj imie: ");
		System.out.println("Partner: " + pary.get(scanner.next()));
	}
}
