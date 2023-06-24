package lab11.z4;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
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
		
		try (DataInputStream inputStream = new DataInputStream(new FileInputStream(path))) {
			System.out.format("%02d.%02d.%d\n", inputStream.readInt(), inputStream.readInt(), inputStream.readInt());
		} catch (Exception e) {
			System.out.println("Nie udalo sie odczytac pliku: " + e);
		}
	}
}
