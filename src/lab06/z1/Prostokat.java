package lab06.z1;

class Prostokat extends Figura {
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
			
	}
	
	Prostokat(float wys, float szer, String kolor) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

    double getPowierzchnia() {
        return (szer * wys);
    }
	
	@Override
	String opis() {
		return "Klasa Prostokat. Wysokosc = " + wys + " Szerokosc = " + szer + " Pole powierzchni = " + getPowierzchnia();
	}
}