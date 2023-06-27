package projekt;

public class Engine {
	private static final int MAX_ROT_SPEED = 733;
	private static final int IDLE_ROT_SPEED = 84;
	private static final double MAX_FUEL = 50.0;
	private static final double FUEL_BURN_RATE = .001; // per radian
	private static final double MAX_OIL = 2.0;
	private static final double MIN_OIL = 1.0;
	private static final double OIL_BURN_RATE = .00001;
	private boolean isOn;
	private float throttle;
	private double rotationSpeed;
	private float torque;
	private double fuel; // litres
	private double oil;
	private float condition;
	
	public Engine() {
		isOn = false;
		throttle = 0.0F;
		rotationSpeed = 0;
		torque = 0;
		fuel = MAX_FUEL;
		oil = MAX_OIL;
		condition = 1.0F;
	}
	
	void turnOn() {
		if (fuel <= 0 || condition <= 0) return;
		isOn = true;
		rotationSpeed = IDLE_ROT_SPEED;
		calcTorque();
	}
	
	void turnOff() {
		isOn = false;
		rotationSpeed = 0;
		torque = 0;
	}
	
	void burnFuel(double deltaTime) {
		if (!isOn) return;
		fuel -= FUEL_BURN_RATE * rotationSpeed * (throttle+0.1) * deltaTime;
		if (fuel <= 0) {
			fuel = 0.0;
			turnOff();
		}
	}
	
	void burnOil(double deltaTime) {
		oil -= OIL_BURN_RATE * rotationSpeed * deltaTime;
		if (oil < 0) oil = 0;
		if (oil < MIN_OIL) {
			condition -= 0.01;
			if (condition <= 0) {
				condition = 0;
				turnOff();
			}
		}
	}
	
	private void calcTorque() {
		if (!isOn) {
			torque = 0.0F;
			return;
		}
		double a = Math.sin(throttle * Math.PI/2) + 0.01;
		torque = (float)(-Math.pow(a,2)*Math.pow(rotationSpeed/a - 262, 2)/500 + 410*a);
	}
	
	void setRotationSpeed(double rotationSpeed) {
		if (rotationSpeed < 0) throw new IllegalArgumentException();
		if (rotationSpeed < IDLE_ROT_SPEED && isOn) {
			this.rotationSpeed = IDLE_ROT_SPEED;
			calcTorque();
			return;
		}
		this.rotationSpeed = Math.min(rotationSpeed, MAX_ROT_SPEED);
		calcTorque();
	}
	
	float getTorque() {
		return torque;
	}
	
	void throttleUp() {
		throttle += 0.1F;
		if (throttle > 1.0F)
			throttle = 1.0F;
	}
	
	void throttleDown() {
		throttle -= 0.1F;
		if (throttle < 0.0F)
			throttle = 0.0F;
	}
	
	void refuel() {
		fuel = MAX_FUEL;
	}
	
	void refill() {
		oil = MAX_OIL;
	}
	
	public float getThrottle() {
		return throttle;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public double getRotationSpeed() {
		return rotationSpeed;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	public double getOil() {
		return oil;
	}
	
	public float getCondition() {
		return condition;
	}
}
