package projekt;

import java.util.Scanner;

public class Menu {
	static boolean mainMenu(Car car) {
		Scanner scanner = new Scanner(System.in);
		boolean shouldExit = false;
		
		printDriveParams(car);
		System.out.println();
		
		if (car.isOutOfFuel()) System.out.print("Out of fuel!");
		if (car.isBroken()) System.out.print("The engine's broken!");
		System.out.println();
		
		System.out.println();
		
		printOptions();
		System.out.print("Input: ");
		
		char[] actions = scanner.nextLine().toUpperCase().toCharArray();
		
		for (char a : actions) {
			switch (a) {
				case 'W' -> car.throttleUp();
				case 'S' -> car.throttleDown();
				case 'Q' -> car.shiftUp();
				case 'A' -> car.shiftDown();
				case 'E' -> car.brakeUp();
				case 'D' -> car.brakeDown();
				case 'R' -> car.refuel();
				case 'F' -> car.refillOil();
				case 'T' -> car.toggle();
				case 'X' -> shouldExit = true;
			}
		}
		
		return shouldExit;
	}
	
	private static void printDriveParams(Car car) {
		System.out.println("\n\n\nIgnition: " + (car.isOn() ? "On" : "Off"));
		System.out.format("Throttle: %d%%\t\t\tBrakes: %d%%\n", (int)(car.getThrottle()*100), (int)(car.getBrakes() * 100));
		System.out.format("   Speed: %4.3g km/h\t\t   RPM: %.4g\t\tGear: %d\n    Fuel: %.3gl\t\t\t   Oil: %.3gl\n",
				UnitConvert.toKph(car.getSpeed()), UnitConvert.toRpm(car.getRotSpeed()), car.getGear(), car.getFuel(), car.getOil());
	}
	
	private static void printOptions() {
		System.out.println("""
    W - Increase throttle by 10%
    S - Decrease throttle by 10%
    E - Increase brake by 10%
    D - Decrease brake by 10%
    Q - Gear up
    A - Gear down
    R - Refuel
    F - Refill oil
    T - Toggle ignition
    X - Exit
    <Enter> - Confirm and advance time
""");
		
	}
}
