package objects;

import java.util.ArrayList;

class Car {
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return"속도는" + getSpeed() + "km 입니다.";
		
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Car car = new Car();
		car.setSpeed(200);
		System.out.println(car.toString());

		car.setSpeed(300);
		System.out.println(car.toString());
	}

}
