package lab08.z3;

public class Adres {
	private String ulica, miasto, kodPocztowy;
	private int numerDomu;
	
	public Adres(String ulica, String miasto, String kodPocztowy, int numerDomu) throws NieprawidlowyAdresException {
		String err = "";
		
		if (ulica == null) err += "Ulica nie może być nullem. ";
		if (miasto == null) err += "Miasto nie może być nullem. ";
		if (kodPocztowy == null) err += "Kod Pocztowy nie może być nullem. ";
		if (numerDomu <= 0) err += "Numer Domu musi być liczbą dodatnią. ";
		
		if (!err.isEmpty()) throw new NieprawidlowyAdresException(err);
		
		this.ulica = ulica;
		this.miasto = miasto;
		this.kodPocztowy = kodPocztowy;
		this.numerDomu = numerDomu;
	}
}
