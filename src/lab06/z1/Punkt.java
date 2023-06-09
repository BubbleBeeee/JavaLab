package lab06.z1;

public class Punkt {
	public int x, y;
	
	public Punkt() {
		x = 0;
		y = 0;
	}
	
	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void zeruj() {
		x = 0;
		y = 0;
	}
	
	void opis() {
		System.out.println("Punkt o współrzędnych: (" + x + ", " + y + ")");
	}
	
	void przesun(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
