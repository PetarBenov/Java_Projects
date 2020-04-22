import java.util.ArrayList;
import java.util.Scanner;

public class numCMD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		String[] input = scan.nextLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			numbers.add(Integer.parseInt(input[i]));
		}

		while (true) {
			String[] commands = scan.nextLine().split(" ");
			if (commands[0].equals("print")) {
				break;
			} else if (commands[0].equals("push")) {
				int num = Integer.parseInt(commands[1]);
				numbers.add(num);
			} else if (commands[0].equals("pop")) {
				System.out.println(numbers.get(numbers.size() - 1));
				numbers.remove(numbers.size() - 1);
			} else if (commands[0].equals("shift")) {
				int temp = numbers.get(0);
				numbers.set(0, numbers.get(numbers.size() - 1));
				numbers.set(numbers.size() - 1, temp);
			}
		}

		for (int i = numbers.size() - 1; i >= 0; i--) {
			System.out.print(numbers.get(i) + " ");
		}

	}

}
