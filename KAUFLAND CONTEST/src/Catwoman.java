import java.util.Scanner;

public class Catwoman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfBag = Integer.parseInt(sc.nextLine());
		int[] bag = new int[sizeOfBag];
		int count = 0;
		int sum = 0;

		while (true) {
			String[] input = sc.nextLine().split(" ");
			int position = Integer.parseInt(input[0]);
			int value = Integer.parseInt(input[1]);

			if (position >= bag.length || value < 0) {
				continue;
			} else if (bag[position] == 0) {
				bag[position] = value;
				count++;
			} else if (bag[position] != 0) {
				for (int i = position; i < bag.length; i++) {
					if (bag[i] == 0) {
						bag[i] = value;
						count++;
						break;
					}
				}
			}
			if (count >= bag.length) {
				break;
			}
		}

		for (int i = 0; i < bag.length; i++) {
			sum += bag[i];
		}
		System.out.println(sum);
	}
}
