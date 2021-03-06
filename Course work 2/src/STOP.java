import java.util.Scanner;

public class STOP {

	static String repeatStr(String strToRepeat, int count) {
		String text = "";
		for (int i = 0; i < count; i++) {
			text += strToRepeat;
		}
		return text;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size for your sign: ");
		int size = Integer.parseInt(scanner.nextLine());
		int dots = size + 1;
		int underscores = (size * 2) + 1;
		System.out.printf("%s%s%s", repeatStr(".", dots), repeatStr("_", underscores), repeatStr(".", dots));
		System.out.println();
		dots--;
		underscores -= 2;
		for (int i = 0; i < size; i++) {
			System.out.printf("%s//%s\\\\%s", repeatStr(".", dots), repeatStr("_", underscores), repeatStr(".", dots));
			System.out.println();
			underscores += 2;
			dots--;
		}
		System.out.printf("//%sSTOP!%s\\\\", repeatStr("_", (underscores - 5) / 2),
				repeatStr("_", (underscores - 5) / 2));
		System.out.println();
		for (int i = 0; i < size; i++) {
			System.out.printf("%s\\\\%s//%s", repeatStr(".", i), repeatStr("_", underscores), repeatStr(".", i));
			underscores -= 2;
			System.out.println();
		}
	}
}


