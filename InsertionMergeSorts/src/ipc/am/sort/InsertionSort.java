package ipc.am.sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String a[]) {	
		int[] array = { 9, 34, 22, -56, 0,17, 687, 8, 4 };
		System.out.println("before: " + Arrays.toString(array));
		startInsertionSort(array);
		System.out.println("after:  " + Arrays.toString(array));
	}

	public static int[] startInsertionSort(int[] input) {

		int temp;
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
		}
		return input;
	}
}
