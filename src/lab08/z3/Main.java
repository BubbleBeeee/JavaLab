package lab08.z3;

public class Main {
	public static void main(String[] args) {
		try {
			Adres a = new Adres(null, null, null, -2);
		} catch (NieprawidlowyAdresException e) {
			System.out.println(e.getMessage());
		}
	}
}
