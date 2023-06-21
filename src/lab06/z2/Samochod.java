package lab06.z2;

import java.util.Scanner;

public class Samochod {
	String marka;
	String model;
	String nadwozie;
	String kolor;
	int rok;
	double przebieg;
	
	public Samochod() {
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Podaj marke: ");
			marka = scanner.nextLine();
		} while (marka == null);
		
		do {
			System.out.print("Podaj model: ");
			model = scanner.nextLine();
		} while (model == null);
		
		do {
			System.out.print("Podaj rodzaj nadwozia: ");
			nadwozie = scanner.nextLine();
		} while (nadwozie == null);
		
		do {
			System.out.print("Podaj kolor: ");
			kolor = scanner.nextLine();
		} while (kolor == null);
		
		System.out.print("Podaj rok produkcji: ");
		rok = scanner.nextInt();
		
		do {
			System.out.print("Podaj przebieg: ");
			przebieg = scanner.nextDouble();
		} while (przebieg < 0);
	}
	
	public Samochod(String marka, String model, String nadwozie, String kolor, int rok, double przebieg) {
		this.marka = marka;
		this.model = model;
		this.nadwozie = nadwozie;
		this.kolor = kolor;
		this.rok = rok;
		this.przebieg = przebieg;
	}
	
	void opis() {
		System.out.println("Samochod marki " + marka + ". Model " + model + " z nadwoziem " + nadwozie
		+ ". Kolor " + kolor + ". Rok produkcji " + rok + ". Przebieg " + przebieg);
	}
}
