package projekt;

public class Car {
	private static final float TIRE_RADIUS = 0.114F; // meters
	private static final int MASS = 1300; // kilograms
	private static final double DRAG_PARAM = 0.00001;
	private static final double FRICTION = 0.5;
	private static final double BRAKE_FORCE = 25;
	
	private double speed; // m/s
	private float brakes;
	private final Engine engine;
	private final Transmission transmission;
	
	public Car() {
		speed = 0;
		brakes = 0.0F;
		engine = new Engine();
		transmission = new Transmission();
	}
	
	void update(double deltaTime) {
		updateSpeed(deltaTime);
		engine.burnFuel(deltaTime);
		engine.burnOil(deltaTime);
	}
	
	private void updateSpeed(double deltaTime) {
		double wheelSpeed = speed / TIRE_RADIUS;
		engine.setRotationSpeed(transmission.wheelToEngineSpeed(wheelSpeed));
		double wheelTorque = transmission.engineToWheelTorque(engine.getTorque());
		double acceleration = wheelTorque / (MASS * TIRE_RADIUS) - DRAG_PARAM * speed * speed;
		acceleration -= brakes * BRAKE_FORCE + FRICTION;
		speed += acceleration * deltaTime;
		if (speed < 0) speed = 0;
	}
	
	void turnOn() {
		engine.turnOn();
	}
	
	void turnOff() {
		engine.turnOff();
	}
	
	void toggle() {
		if (engine.isOn()) {
			turnOff();
		}
		else {
			turnOn();
		}
	}
	
	void refuel() {
		engine.refuel();
	}
	
	void refillOil() {
		engine.refill();
	}
	
	void throttleUp() {
		engine.throttleUp();
	}
	
	void throttleDown() {
		engine.throttleDown();
	}
	
	void brakeUp() {
		brakes += 0.1F;
		if (brakes > 1.0F) brakes = 1.0F;
	}
	
	void brakeDown() {
		brakes -= 0.1F;
		if (brakes < 0.0F) brakes = 0.0F;
	}
	
	void shiftUp() {
		transmission.shiftUp();
	}
	
	void shiftDown() {
		transmission.shiftDown();
	}
	
	boolean isOutOfFuel() {
		return engine.getFuel() <= 0;
	}
	
	boolean isBroken() {
		return engine.getCondition() <= 0;
	}
	
	double getRotSpeed() {
		return engine.getRotationSpeed();
	}
	
	double getSpeed() {
		return speed;
	}
	
	double getFuel() {
		return engine.getFuel();
	}
	
	boolean isOn() {
		return engine.isOn();
	}
	
	float getThrottle() {
		return engine.getThrottle();
	}
	
	float getBrakes() {
		return brakes;
	}
	
	int getGear() {
		return transmission.getGear();
	}
	
	double getOil() {
		return engine.getOil();
	}
	
	float getCondition() {
		return engine.getCondition();
	}
}
