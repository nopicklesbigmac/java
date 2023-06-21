package inheritance4;

public class Car {
   private int maxSpeed;
   private double distance;
   
   public Car(int maxSpeed) {
      this.maxSpeed = maxSpeed;
   }
   public void drive() {
      distance = distance + maxSpeed * 0.5;
   }

   public void setMaxSpeed(int maxSpeed) {
      this.maxSpeed = maxSpeed;
   }
   public int getMaxSpeed() {
      return maxSpeed;
   }
   public void setDistance(double distance) {
      this.distance = distance;
   }
   public double getDistance() {
      return distance;
   }
}
   
