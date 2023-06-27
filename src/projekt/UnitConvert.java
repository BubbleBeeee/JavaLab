package projekt;

public class UnitConvert {
	private static final double RADS_TO_RPM = 9.5492965838;
	private static final double MPS_TO_KPH = 3.6;
	
	static double toRpm(double rads) {
		return rads * RADS_TO_RPM;
	}
	
	static double toKph(double mps) {
		return mps * MPS_TO_KPH;
	}
}
