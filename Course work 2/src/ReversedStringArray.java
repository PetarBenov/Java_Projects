import java.util.Scanner;

public class ReversedStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String[] strings = string.split("");
		reverseArray(strings);

	}

	public static void reverseArray(String[] strings) {
		String temp = "";
		for (int i = 0; i < strings.length; i++) {
			temp = strings[i];
			strings[i] = strings[strings.length - i - 1];
			strings[strings.length - i - 1] = temp;

			if (i == strings.length / 2) {
				break;
			}
		}
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " ");
		}
	}

}




