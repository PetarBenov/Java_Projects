package Bat_vehicles;

abstract class Bat_SUV extends Bat_Speedster {

	public Bat_SUV(int seats, int horsepower, int weight, String gearbox, String carColor, String fuel) {
		super(seats, horsepower, weight, gearbox, carColor, fuel);
	}

	public void FourByFour() {

	}

	@Override
	public abstract void Accelerate();

	public abstract void Stop();
}
