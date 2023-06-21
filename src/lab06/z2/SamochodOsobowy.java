package lab06.z2;

import java.util.Scanner;

public class SamochodOsobowy extends Samochod {
	float waga;
	float pojemnoscSilnika;
	int iloscOsob;
	
	public SamochodOsobowy() {
		super();
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Podaj wage (2 - 4,5t): ");
			waga = scanner.nextFloat();
		} while (waga < 2.0F || waga > 4.5F);
		
		do {
			System.out.print("Podaj pojemność silnika (0,8 - 3,0l): ");
			pojemnoscSilnika = scanner.nextFloat();
		} while (pojemnoscSilnika < 0.8F || pojemnoscSilnika > 3.0F);
		
		do {
			System.out.print("Podaj ilosc osob: ");
			iloscOsob = scanner.nextInt();
		} while (iloscOsob <= 0);
	}
	
	@Override
	void opis() {
		System.out.println("Samochod osobowy marki " + marka + ". Model " + model + " z nadwoziem " + nadwozie
				+ ". Kolor " + kolor + ". Rok produkcji " + rok + ". Przebieg " + przebieg
				+ ". Waga " + waga + "t. Pojemność silnika " + pojemnoscSilnika + "l. Ilość osób " + iloscOsob);
	}
}
