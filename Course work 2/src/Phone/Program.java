package Phone;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Phone> phones = new ArrayList<>();
		phones.add(new Phone("Samsung", 2600, new Battery("Li-Ion", 2000, 1000), new Display(5.5, 100000)));
		phones.add(new Phone("Huawei", 500, new Battery("Li-Ion", 2000, 1000), new Display(4.7, 100000)));
		phones.add(new Phone("Iphone", 10000, new Battery("Li-PO", 2000, 1000), new Display(4, 100000)));
		phones.add(Phone.nokiaN95);
		for (Phone telephone : phones) {
			System.out.println(telephone);
			System.out.println("-----------------");
		}
		System.out.println("********************");
		Phone.printNokiaN95();
	}

}


