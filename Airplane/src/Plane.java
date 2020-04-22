import java.util.ArrayList;

public class Plane {
	private String name;
	private double maxLoad;
	private ArrayList<Passengers> cargo;
	
	public Plane(String name, double maxLoad) {
		this.name = name;
		this.maxLoad = maxLoad;
		this.cargo = new ArrayList<Passengers>();
	}

	public void add(Passengers patnici) {
		if(patnici.getSeats() > this.maxLoad) {
			System.out.println(this.name + " can't load " + patnici.getSeats());
		} else {
			System.out.println(this.name + " loaded " + patnici.getSeats());
			this.cargo.add(patnici);
		}
	}
}
