package lab06.z1;

public class Okrag extends Figura {
	Punkt s;
	double r;
	
	public Okrag() {
		s = new Punkt();
		r = 0.0;
	}
	
	public Okrag(Punkt s, double r) {
		this.s = s;
		this.r = r;
	}
	
	double getPowierzchnia() {
		return Math.PI * r * r;
	}
	
	double getSrednica() {
		return 2 * r;
	}
	
	boolean wSrodku(Punkt p) {
		return Math.pow(s.x - p.x, 2) + Math.pow(s.y - p.y, 2) <= r*r;
	}
	
	public double getR() {
		return r;
	}
	
	public void setR(double r) {
		this.r = r;
	}
	
	@Override
	String opis() {
		return "Klasa Okrag. Srodek = (" + s.x + ", " + s.y + "). Promien = " + r + "Pole powierzchni = " + getPowierzchnia();
	}
}
