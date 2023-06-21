package lab06.z2;

public class Main {
	public static void main(String[] args) {
		SamochodOsobowy s1 = new SamochodOsobowy();
		Samochod s2 = new Samochod("Fiat", "Panda", "hatchback", "czerwony", 2011, 125267);
		Samochod s3 = new Samochod();
		
		s1.opis();
		System.out.println();
		s2.opis();
		System.out.println();
		s3.opis();
	}
}
