import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Soccer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> goals = new HashMap<String, Integer>();

		while (true) {
			String[] input = sc.nextLine().split(" - ");

			if (input[0].equals("End of season")) {
				break;
			}

			if (goals.containsKey(input[0])) {
				goals.put(input[0], goals.get(input[0]) + Integer.parseInt(input[1]));
			} else {
				goals.put(input[0], Integer.parseInt(input[1]));
			}
		}

		ArrayList<String> keys = new ArrayList<String>(goals.keySet());
		Collections.sort(keys);

		for (String s : keys) {
			System.out.println(s + " -> " + goals.get(s));
		}
	}

}
