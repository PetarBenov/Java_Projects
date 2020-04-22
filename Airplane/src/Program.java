import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		double maxLoad = 150;
		double seats;
		System.out.printf("Enter the name of the plane: ");
		name = sc.nextLine();
		Plane p1 = new Plane(name, maxLoad);
		System.out.printf("Enter the amount of the plane: ");
		seats = sc.nextDouble();
		System.out.println();
		System.out.println("Result: ");
		Passengers ps1 = new Passengers(seats);
		p1.add(ps1);
	}

}
