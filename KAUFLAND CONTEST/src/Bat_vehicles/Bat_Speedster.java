package Bat_vehicles;

abstract class Bat_Speedster {
	protected int seats;
	protected int horsepower;
	protected int weight;
	protected String gearbox;
	protected String carColor;
	protected String fuel;

	public Bat_Speedster(int seats, int horsepower, int weight, String gearbox, String carColor, String fuel) {
		this.seats = seats;
		this.horsepower = horsepower;
		this.weight = weight;
		this.gearbox = gearbox;
		this.carColor = carColor;
		this.fuel = fuel;
	}

	public abstract void Accelerate();

	public abstract void Stop();

	public void Roof() {

	}
}
