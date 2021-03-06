import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TempList.input("D:\\Eclipse Projects\\Goceva\\Temperature.txt");
		TempList.print();
		System.out.println("Average T= " + TempList.average());
		MutableFloat temp = new MutableFloat();
		MutableInteger day = new MutableInteger();
		TempList.max(temp, day);
		System.out.println(day.getData() + ", " + temp.getData());

		int dayIndex = TempList.maxTemp();
		System.out.println("Max T=" + TempList.getTemp(dayIndex) + ", day=" + dayIndex);
		System.out.println(TempList.maxTemperature());

		Scanner sc = new Scanner(System.in);
		System.out.print("Input string: ");
		String line = sc.nextLine();
		System.out.println(reverse(line));

		System.out.print("Input whole number: ");
		int number = sc.nextInt();
		int result = Integer.parseInt(reverse(number + ""));
		System.out.println(result);

		System.out.println(reverse("hello"));
	}

	static String reverse(String str) {
		StringBuilder val = new StringBuilder(str);
		val.reverse();
		return val.toString();
	}
}
