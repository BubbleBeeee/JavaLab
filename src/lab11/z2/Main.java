package lab11.z2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String path;
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Podaj sciezke: ");
			path = scanner.nextLine();
		}
		
		File file;
		file = new File(path);
		
		Scanner scanner;
		try {
			scanner  = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Nie udalo sie odczytac pliku: " + path);
			return;
		}
		
		int lines = 0;
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
			lines++;
		}
		System.out.println("\nIlosc linii: " + lines);
	}
}
