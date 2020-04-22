import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bestWord = "";
		int bestPoints = 0;
		while (true) {
			String entry = sc.nextLine();
			if (entry.equals("END OF GAME")) {
				break;
			} else {
				int entrysPoints = points(entry);
				if (entrysPoints > bestPoints) {
					bestWord = entry;
					bestPoints = entrysPoints;
				}
			}

		}

		System.out.println("Winner is word:" + bestWord);
		System.out.println("Points:" + bestPoints);
	}

	static int points(String word) {
		int score = 0;
		char[] letters = word.toCharArray();

		if (Character.isUpperCase(letters[0])) {
			score += 15;
		}
		for (int i = 0; i < letters.length; i++) {
			score += letters[i];
		}
		if (letters[letters.length - 1] == 't') {
			score += 20;
		}
		if (letters.length >= 10) {
			score += 30;
		}

		return score;
	}
}


