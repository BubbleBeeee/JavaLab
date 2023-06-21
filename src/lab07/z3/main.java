package lab07.z3;

class main
{
	public static void main(String[] arg)
	{
		Prostokat maly_punkt = new Prostokat(3, 6, "czerwony");
		System.out.println(maly_punkt.opis());
		Trojkat rownoboczny = new Trojkat(7, 4, "bialy");
		System.out.println(rownoboczny.opis());
		
		Punkt punkt = new Punkt(7, 5);
		
		Kwadrat kwadrat = new Kwadrat(8, "brązowy");
		System.out.println(kwadrat.opis());
		
		IFigury[] tablicaFigur =  new IFigury[3];
		tablicaFigur[0] = maly_punkt;
		tablicaFigur[1] = rownoboczny;
		tablicaFigur[2] = kwadrat;
		
		for (IFigury f : tablicaFigur) {
			System.out.println(f.getPowierzchnia());
			System.out.println(f.wPolu(punkt));
		}
	}
}