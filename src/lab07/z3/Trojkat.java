package lab07.z3;


class Trojkat extends Figura implements IFigury {
	int wys=0;
	int podst=0;
	Trojkat(int wys,int podst,String kolor){
		
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}
	
	@Override
	public String opis(){
		return "Trojkat o wymairach: "+wys+"  "+podst;
	}
	
	@Override
	void skaluj(float skala) {
		wys = (int)((float)wys * skala);
		podst = (int)((float)podst * skala);
	}
	
	@Override
	public float getPowierzchnia() {
		return (float)wys * (float)podst / 2.0F;
	}
	
	@Override
	public boolean wPolu(Punkt p) {
		return false;
	}
}