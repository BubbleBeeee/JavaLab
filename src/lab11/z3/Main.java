package lab11.z3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String path;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj sciezke: ");
		path = scanner.nextLine();
		
		System.out.println("Podaj datę urodzenia:");
		try (DataOutputStream output = new DataOutputStream(new FileOutputStream(path))) {
			System.out.print("Dzien: ");
			output.writeInt(scanner.nextInt());
			
			System.out.print("Miesiac: ");
			output.writeInt(scanner.nextInt());
			
			System.out.print("Rok: ");
			output.writeInt(scanner.nextInt());
		} catch (Exception e) {
			System.out.println("Nie udało sie zapisac pliku: " + path);
		}
	}
}
