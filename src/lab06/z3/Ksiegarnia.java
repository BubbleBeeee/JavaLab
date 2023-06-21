package lab06.z3;

import java.util.ArrayList;

public class Ksiegarnia {
	ArrayList<Ksiazka> ksiazki;
	
	public Ksiegarnia() {
		ksiazki = new ArrayList<>();
	}
	
	void dodajKsiazke(Ksiazka ksiazka) {
		ksiazki.add(ksiazka);
	}
	
	Ksiazka pozycKsiazke(String tytul) {
		for (Ksiazka k : ksiazki) {
			if (k.tytul.equals(tytul)) {
				ksiazki.remove(k);
				return k;
			}
		}
		return null;
	}
}
