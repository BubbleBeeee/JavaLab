package lab07.z1;

public class Main {
	public static void main(String[] args) {
		Samolot samolot = new Samolot();
		samolot.lec();
		
		System.out.println();
		
		Statek statek = new Statek();
		statek.plyn();
		
		System.out.println();
		
		Samochod samochod = new Samochod();
		samochod.jedz();
		
		System.out.println();
		
		Amfibia amfibia = new Amfibia();
		amfibia.jedz();
		amfibia.plyn();
	}
}
