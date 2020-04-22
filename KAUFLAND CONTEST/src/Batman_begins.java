
import java.util.Scanner;

public class Batman_begins {
	
	public static int maxNum(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			max = Math.max(arr[i], max);
		}
		return max;
	}
	
	public static int minNum(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			min = Math.min(arr[i], min);
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String[] input = sc.nextLine().split(" ");
		int[] numbers = new int [input.length];
		int count = numbers.length;
		
		int sum = 0;
		for(int i = 0; i < input.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
			sum += numbers[i];
		}
		
		int average = sum / count;
		
		System.out.println("Count is: " + count);
		System.out.println("Min is: " + minNum(numbers));
		System.out.println("Max is: " + maxNum(numbers));
		System.out.println("Average is: " + average);
		System.out.println("Sum is: " + sum);
		
	}

}
