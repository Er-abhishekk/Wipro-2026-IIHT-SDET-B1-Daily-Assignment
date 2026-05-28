package Day3;

public class Car {
	private boolean engineStatus;
    private int speed;
    private int fuelLevel = 100;

    public void startEngine() {
        this.engineStatus = true;
        System.out.println("Engine started");
    }

    public void accelerate() {
        if (engineStatus && fuelLevel > 0) {
            speed += 10;
            fuelLevel -= 5;
            System.out.println("speed"+ speed+"fuellevwel"+ fuelLevel);
        } else {
            System.out.println("Cannot accelerate");
        }
    }

    public static void main(String[] arg) {
		Car car = new Car();
		car.startEngine();
        car.accelerate();
		
	}
}
