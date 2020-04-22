import java.util.Scanner;

public class BarStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int beers = 200;
		int wines = 300;
		int beerDeliveries = 0;
		int beerOrders = 0;
		int wineDeliveries = 0;
		int wineOrders = 0;

		while (true) {
			String input = sc.nextLine();
			if (input.equals("END")) {
				break;
			}
			String[] inputs = input.split(": ");
			int quantity = Integer.parseInt(inputs[1]);
			if (quantity == 0) {
				continue;
			}
			if (inputs[0].equals("Beers")) {
				beers += quantity;
				if (quantity > 0) {
					beerDeliveries++;
				} else {
					beerOrders++;
				}
			} else if (inputs[0].equals("Wines")) {
				wines += quantity;
				if (quantity > 0) {
					wineDeliveries++;
				} else {
					wineOrders++;
				}
			}
		}
		System.out.println();
		System.out.println("Wines: "+ wines);
		System.out.println("Deliveries: "+ wineDeliveries);
		System.out.println("Orders: "+ wineOrders);
		System.out.println("Beers: "+ beers);
		System.out.println("Deliveries: "+ beerDeliveries);
		System.out.println("Orders: "+ beerOrders);
	}

}
