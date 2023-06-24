package lab11.z1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj sciezke: ");
		String path = scanner.nextLine();
		
		System.out.println("Podaj tekst:");
		try (FileWriter writer = new FileWriter(path)) {
			while (true) {
				String line = scanner.nextLine();
				
				if (line.equals("-")) break;
				
				writer.write(line);
				writer.write(System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println("Nie udało się zapisać pliku " + path);
		}
	}
}
