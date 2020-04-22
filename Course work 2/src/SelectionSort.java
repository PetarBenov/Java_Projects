import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 45, 71, 9, 94 };
		System.out.println("НЕ-сортираният масив е: ");
		System.out.println(Arrays.toString(numbers));
		System.out.println();
		System.out.println("Сортираният масив е: ");
		selectionSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}

