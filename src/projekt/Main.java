package projekt;

public class Main {
	private static final double DELTA_TIME = 0.1; // s
	public static void main(String[] args) {
		Car car = new Car();
		while (!Menu.mainMenu(car)) {
			car.update(DELTA_TIME);
		}
	}
}
