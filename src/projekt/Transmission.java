package projekt;

public class Transmission {
	private static final float[] GEAR_RATIOS = {
			0.00F,  // Neutral
			2.97F,  // 1st
			2.07F,  // 2nd
			1.43F,  // 3rd
			1.00F,  // 4th
			0.84F,  // 5th
			0.56F   // 6th
	};
	private static final float DIFF_RATIO = 3.42F;
	private static final float EFFICIENCY = 0.85F;
	
	private float totalRatio;
	
	private int gear;
	
	public Transmission() {
		gear = 0;
		totalRatio = 0.0F;
	}
	
	void shiftUp() {
		if (gear < 6) gear++;
		calcTotalRatio();
	}
	
	void shiftDown() {
		if (gear > 0) gear--;
		calcTotalRatio();
	}
	
	double wheelToEngineSpeed(double wheelSpeed) {
		return wheelSpeed * totalRatio;
	}
	
	double engineToWheelTorque(double engineTorque) {
		return engineTorque * totalRatio * EFFICIENCY;
	}
	
	private void calcTotalRatio() {
		totalRatio = GEAR_RATIOS[gear] * DIFF_RATIO;
	}
	
	public int getGear() {
		return gear;
	}
}
