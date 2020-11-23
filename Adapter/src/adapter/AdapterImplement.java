package adapter;

public class AdapterImplement implements SpeedAdapter {
	private Speed Cars;
	
	
	public AdapterImplement(Speed Cars) {
		
		this.Cars = Cars;
	}
	
	
	@Override
	public double getSpeed() {
		
		return KmhConvert(Cars.getSpeed());
	}

	
	public double KmhConvert(double mph) {
		
		return mph * 1.60934;
	}
}
