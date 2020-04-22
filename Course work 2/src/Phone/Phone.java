package Phone;

public class Phone {
	private final String model;
	private String manufacturer;
	private final double price;
	private String owner;
	private Battery battery = new Battery();
	private Display display = new Display();

	protected static Phone nokiaN95 = new Phone("NokiaN95", 400, new Battery("Li-Ion", 200, 200), new Display(2.6, 15000));

	public Phone(String model, double price, Battery battery, Display display) {
		this.model = model;
		this.price = price;
		this.battery = battery;
		this.display = display;
	}

	public String getModel() {
		return model;
	}

	public String getManufaturer() {
		return manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public String getOwner() {
		return owner;
	}

	public Battery getBattery() {
		return battery;
	}

	public Display getDisplay() {
		return display;
	}

	@Override
	public String toString() {
		return "Model: " + this.model + "\nPrice: " + this.price + "\nBattery: " + battery.getModel() + ", "
				+ battery.getHoursTalk() + "\nDisplay: " + display.getSize() + ", " + display.getColors();
	}

	public static void printNokiaN95() {
		System.out.println("Model: " + nokiaN95.model + "\nPrice: " + nokiaN95.price + "\nBattery: "
				+ nokiaN95.battery.getModel() + ", " + nokiaN95.battery.getHoursTalk() + "\nDisplay: "
				+ nokiaN95.display.getSize() + ", " + nokiaN95.display.getColors());
	}
}


