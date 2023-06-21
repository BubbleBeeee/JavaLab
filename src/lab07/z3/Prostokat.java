package lab07.z3;

class Prostokat extends Figura implements IFigury {
	int wys=0;
	int szer=0;
	
	Prostokat(int wys,int szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	
	@Override
	public String opis(){
		return "Prostokat o wymairach: "+szer+" x "+wys;
	}
	
	@Override
	void skaluj(float skala) {
		wys = (int) ((float) wys * skala);
		szer = (int) ((float) szer * skala);
	}
	
	@Override
	public float getPowierzchnia() {
		return wys * szer;
	}
	
	@Override
	public boolean wPolu(Punkt p) {
		int ax = Math.abs(p.x);
		int ay = Math.abs(p.y);
		
		return ax <= szer && ay <= wys;
	}
}