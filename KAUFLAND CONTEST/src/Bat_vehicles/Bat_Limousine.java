package Bat_vehicles;

abstract class Bat_Limousine extends Bat_Speedster {
	public Bat_Limousine(int seats, int horsepower, int weight, String gearbox, String carColor, String fuel) {
		super(seats, horsepower, weight, gearbox, carColor, fuel);
	}

	public void Recharge() {

	}

	@Override
	public abstract void Accelerate();

	public abstract void Stop();
}
