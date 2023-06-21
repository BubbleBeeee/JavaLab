package lab06.z1;

public class Kwadrat extends Prostokat {
	double a;
	public Kwadrat(double a) {
		super(a, a);
		this.a = a;
	}
	
	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	@Override
	String opis() {
		return "Klasa Kwadrat. Bok = " + a + " Pole powierzchni = " + getPowierzchnia();
	}
}
