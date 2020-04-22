
public class Bike implements BikeSpec{
	private String type;
	private String size;
	private String brakes;
	private int price;
	private String tyres;
	
	public Bike(String type, String size, String brakes, int price, String tyres) {
		this.type = type;
		this.size = size;
		this.brakes = brakes;
		this.price = price;
		this.tyres = tyres;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getBrakes() {
		return brakes;
	}

	public void setBrakes(String brakes) {
		this.brakes = brakes;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTyres() {
		return tyres;
	}

	public void setTyres(String tyres) {
		this.tyres = tyres;
	}
	
	
}
