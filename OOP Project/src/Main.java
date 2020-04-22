import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/* Bikes */
		String size;
		String bikeType;
		
		do {
			System.out.print("Please, enter the size: ");
			size = sc.nextLine();
			do {
				System.out.print("Please, enter the type: ");
				bikeType = sc.nextLine();
				System.out.println();
			
			if (size.equals("S")) {
				switch (bikeType) {
				case "downhill":
					BikeSpec dh = new Bike("Downhill", "S", "Hope", 10000, "Maxxis");
					System.out.printf("The bike is: %s", dh.getType());
					System.out.println();
					System.out.printf("The color is: %s", Color.GREEN);
					System.out.println();
					System.out.printf("The size is: %s", dh.getSize());
					System.out.println();
					System.out.printf("The brakes are: %s", dh.getBrakes());
					System.out.println();
					System.out.printf("The price is: %s", dh.getPrice());
					System.out.println();
					System.out.printf("The tyres are: %s", dh.getTyres());
					break;

				case "enduro":
					BikeSpec en = new Bike("Enduro", "S", "Sram", 8300, "Continental");
					System.out.printf("The bike is: %s", en.getType());
					System.out.println();
					System.out.printf("The color is: %s", Color.BlUE);
					System.out.println();
					System.out.printf("The size is: %s", en.getSize());
					System.out.println();
					System.out.printf("The brakes are: %s", en.getBrakes());
					System.out.println();
					System.out.printf("The price is: %s", en.getPrice());
					System.out.println();
					System.out.printf("The tyres are: %s", en.getTyres());
					break;

				case "road":
					BikeSpec dt = new Bike("DirtJump", "S", "Shimano", 5200, "Maxxis");
					System.out.printf("The bike is: %s", dt.getType());
					System.out.println();
					System.out.printf("The color is: %s", Color.RED);
					System.out.println();
					System.out.printf("The size is: %s", dt.getSize());
					System.out.println();
					System.out.printf("The brakes are: %s", dt.getBrakes());
					System.out.println();
					System.out.printf("The price is: %s", dt.getPrice());
					System.out.println();
					System.out.printf("The tyres are: %s", dt.getTyres());
					break;
				}
			} else if (size.equals("M")) {
				switch (bikeType) {
				case "downhill":
					BikeSpec dh = new Bike("Downhill", "M", "Avid", 8500, "Maxxis");
					System.out.printf("The bike is: %s", dh.getType());
					System.out.println();
					System.out.printf("The color is: %s", Color.ORANGE);
					System.out.println();
					System.out.printf("The size is: %s", dh.getSize());
					System.out.println();
					System.out.printf("The brakes are: %s", dh.getBrakes());
					System.out.println();
					System.out.printf("The price is: %s", dh.getPrice());
					System.out.println();
					System.out.printf("The tyres are: %s", dh.getTyres());
					break;

				case "enduro":
					BikeSpec en = new Bike("Enduro", "M", "Formula", 7200, "Michelin");
					System.out.printf("The bike is: %s", en.getType());
					System.out.println();
					System.out.printf("The color is: %s", Color.BLACK);
					System.out.println();
					System.out.printf("The size is: %s", en.getSize());
					System.out.println();
					System.out.printf("The brakes are: %s", en.getBrakes());
					System.out.println();
					System.out.printf("The price is: %s", en.getPrice());
					System.out.println();
					System.out.printf("The tyres are: %s", en.getTyres());
					break;

				case "road":
					BikeSpec dt = new Bike("DirtJump", "M", "Shimano", 3100, "Maxxis");
					System.out.printf("The bike is: %s", dt.getType());
					System.out.println();
					System.out.printf("The color is: %s", Color.WHITE);
					System.out.println();
					System.out.printf("The size is: %s", dt.getSize());
					System.out.println();
					System.out.printf("The brakes are: %s", dt.getBrakes());
					System.out.println();
					System.out.printf("The price is: %s", dt.getPrice());
					System.out.println();
					System.out.printf("The tyres are: %s", dt.getTyres());
					break;
				}
			} else if (size.equals("L")) {
				switch (bikeType) {
				case "downhill":
					BikeSpec dh = new Bike("Downhill", "L", "Magura", 13000, "Maxxis");
					System.out.printf("The bike is: %s", dh.getType());
					System.out.println();
					System.out.printf("The color is: %s", Color.PINK);
					System.out.println();
					System.out.printf("The size is: %s", dh.getSize());
					System.out.println();
					System.out.printf("The brakes are: %s", dh.getBrakes());
					System.out.println();
					System.out.printf("The price is: %s", dh.getPrice());
					System.out.println();
					System.out.printf("The tyres are: %s", dh.getTyres());
					break;

				case "enduro":
					BikeSpec en = new Bike("Enduro", "L", "Sram", 4300, "Schwalbe");
					System.out.printf("The bike is: %s", en.getType());
					System.out.println();
					System.out.printf("The color is: %s", Color.BlUE);
					System.out.println();
					System.out.printf("The size is: %s", en.getSize());
					System.out.println();
					System.out.printf("The brakes are: %s", en.getBrakes());
					System.out.println();
					System.out.printf("The price is: %s", en.getPrice());
					System.out.println();
					System.out.printf("The tyres are: %s", en.getTyres());
					break;

				case "road":
					BikeSpec dt = new Bike("DirtJump", "L", "Shimano", 2640, "Maxxis");
					System.out.printf("The bike is: %s", dt.getType());
					System.out.println();
					System.out.printf("The color is: %s", Color.GREEN);
					System.out.println();
					System.out.printf("The size is: %s", dt.getSize());
					System.out.println();
					System.out.printf("The brakes are: %s", dt.getBrakes());
					System.out.println();
					System.out.printf("The price is: %s", dt.getPrice());
					System.out.println();
					System.out.printf("The tyres are: %s", dt.getTyres());
					break;
				}
			}
			}while(bikeType.equals(""));
		} while (size.equals(""));
		/* Bikes */

		/* Riding program */

		System.out.println();
		System.out.println();
		System.out.println("You can ride a bike!");
		String ride;
		do {
			System.out.println("Please type 'start'");
			ride = sc.nextLine();
			if (ride.equals("start")) {
				while (true) {
					BikeDo d1 = new BikeDoing();
					System.out.println("Type 'jump', so you can jump");
					String jump = sc.nextLine();
					if (jump.equals("jump")) {
						d1.jump();
					}

					System.out.println("Type 'left'");
					String left = sc.nextLine();
					if (left.equals("left")) {
						d1.turnLeft();
					}

					System.out.println("Type 'right'");
					String right = sc.nextLine();
					if (right.equals("right")) {
						d1.turnRight();
					}

					System.out.println("Type 'slow'");
					String brake = sc.nextLine();
					if (brake.equals("slow")) {
						d1.brake();
					}

					System.out.println("Type 'stop' to stop riding");
					String input = sc.nextLine();
					if (input.equals("stop")) {
						System.out.println("You just stoped!");
						break;
					}
				}
			}
		} while (!ride.equals("start"));
		/* Riding program */
		
		/* FILE */
		
		System.out.println();
		System.out.println("Do you want to see the file content?");
		System.out.println("Type 'Yes' or 'No'.");
		String response1 = sc.nextLine();
		System.out.println();
		while(true) {
			if(response1.equals("Yes")) {
				System.out.println("- FILE CONTENT -");
				try {
				      File f1 = new File("D:\\Eclipse Projects\\OOP Project\\File.txt");
				      Scanner myReader = new Scanner(f1);  
				      while (myReader.hasNextLine()) {
				        String data = myReader.nextLine();
				        System.out.println(data);
				      }
				      
				      myReader.close();
				      
				 } catch (FileNotFoundException e) {
				      System.out.println("The file is not found!");
				      e.printStackTrace();
				 }
				break;
			} else if(response1.equals("No")) {
				System.out.println("You said no, so you can't see the content of the file!");
				break;
			} else {
				System.out.println("Do you want to try again?");
				System.out.println("Type 'Yes' to see the file content or type 'No'.");
				response1 = sc.nextLine();
				System.out.println();
				continue;
			}
		}
		
		System.out.println();
		System.out.println("Do you want to see the file info?");
		System.out.println("Type 'Yes' or 'No'.");
		String response2 = sc.nextLine();
		System.out.println();
		while(true) {
			if(response2.equals("Yes")) {
				System.out.println("- FILE INFO -");
				File f1 = new File("D:\\Eclipse Projects\\OOP Project\\File.txt");
			    if (f1.exists()) {
			      System.out.println("File name: " + f1.getName());
			      System.out.println("The path of the file: " + f1.getAbsolutePath());
			      System.out.println("Writeable: " + f1.canWrite());
			      System.out.println("Readable: " + f1.canRead());
			      System.out.println("File size (in bytes): " + f1.length());
			    } else {
			      System.out.println("The file is not found!");
			    }
				break;
			} else if(response2.equals("No")) {
				System.out.println("You said no, so you can't see the file info!");
				break;
			} else {
				System.out.println("Do you want to try again?");
				System.out.println("Type 'Yes' to see the file content or type 'No'.");
				response2 = sc.nextLine();
				System.out.println();
				continue;
			}
		}
		
		/* FILE */
	}
}
