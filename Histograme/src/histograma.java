import java.util.Scanner;

public class histograma {

	public static void main(String[] args) {
		int n;
		double p1Percentage = 0;
		double p2Percentage = 0;
		double p3Percentage = 0;
		double p4Percentage = 0;
		double p5Percentage = 0;

		int cntP1 = 0;
		int cntP2 = 0;
		int cntP3 = 0;
		int cntP4 = 0;
		int cntP5 = 0;

		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			int currentNumber = Integer.parseInt(sc.nextLine());

			if (currentNumber < 200) {
				cntP1++;
			} else if (currentNumber >= 200 && currentNumber <= 399) {
				cntP2++;
			} else if (currentNumber >= 400 && currentNumber <= 599) {
				cntP3++;
			} else if (currentNumber >= 600 && currentNumber <= 799) {
				cntP4++;
			} else {
				cntP5++;
			}
		}
		p1Percentage = cntP1 * 100.0 / n;
		p2Percentage = cntP2 * 100.0 / n;
		p3Percentage = cntP3 * 100.0 / n;
		p4Percentage = cntP4 * 100.0 / n;
		p5Percentage = cntP5 * 100.0 / n;
		
		System.out.println(String.format("%.2f%%", p1Percentage));
		System.out.println(String.format("%.2f%%", p2Percentage));
		System.out.println(String.format("%.2f%%", p3Percentage));
		System.out.println(String.format("%.2f%%", p4Percentage));
		System.out.println(String.format("%.2f%%", p5Percentage));
	}
}
