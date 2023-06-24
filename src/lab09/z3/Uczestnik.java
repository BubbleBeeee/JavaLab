package lab09.z3;

import java.util.Objects;

public class Uczestnik {
	private String ID;
	private String imie;
	private int wiek;
	
	public Uczestnik(String ID, String imie, int wiek) {
		this.ID = ID;
		this.imie = imie;
		this.wiek = wiek;
	}
	
	boolean czyPelnoletni() {
		return wiek >= 18;
	}
	
	@Override
	public String toString() {
		return "Uczestnik{" +
				"ID='" + ID + '\'' +
				", imie='" + imie + '\'' +
				", wiek=" + wiek +
				'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Uczestnik uczestnik = (Uczestnik) o;
		return wiek == uczestnik.wiek && Objects.equals(ID, uczestnik.ID) && Objects.equals(imie, uczestnik.imie);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ID, imie, wiek);
	}
}
