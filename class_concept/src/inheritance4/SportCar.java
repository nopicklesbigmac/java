package inheritance4;

public class SportCar extends Car {
	private boolean buster;
	
	public SportCar(int maxSpeed) {
		super(maxSpeed);
		buster = false;
	}
	public SportCar(int maxSpeed, boolean buster) {
		super(maxSpeed);
		this.buster= buster;
	}
	@Override
	public void drive() {
		if ( buster== true) {
			super.setDistance(super.getDistance()+super.getMaxSpeed()*0.75);
		}else 
			super.drive();
	}

}
