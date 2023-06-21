package lab06.z1;

public class Main {
	public static void main(String[] args) {
		Punkt p1 = new Punkt();
		p1.setX(7);
		p1.setY(3);
		p1.opis();
		
		Punkt p2 = new Punkt(-8, 5);
		p2.przesun(6, -3);
		p2.opis();
		
		Punkt p3 = new Punkt(56, 2);
		p3.zeruj();
		p3.opis();
		
		Figura f = new Figura(p2);
		f.kolor = "czarny";
		f.opis();
		
		Prostokat p = new Prostokat(3.6, 7.1);
		System.out.println(p.getPowierzchnia());
		
		Trojkat t = new Trojkat(7.4, 2.3);
		
		Kwadrat k = new Kwadrat(5.6);
		
		System.out.println(p.opis());
		System.out.println(t.opis());
		System.out.println(k.opis());
	}
}
