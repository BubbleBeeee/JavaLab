package lab07.z1;

public class Amfibia implements Jezdzi, Plywa {
	@Override
	public void jedz() {
		System.out.println("Amfibia jedzie");
	}
	
	@Override
	public void plyn() {
		System.out.println("Amfibia plynie");
	}
}
