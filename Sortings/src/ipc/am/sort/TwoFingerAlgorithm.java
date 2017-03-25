package ipc.am.sort;

import java.util.Arrays;

public class TwoFingerAlgorithm {

	public static void main(String[] args) {
		int[] array1 = { 4, 8, 9, 10, 64, 80, 114 };
		int[] array2 = { 1, 3, 22, 56,66, 444 };
		System.out.println(Arrays.toString(startTwoFingerAlgorithm(array1, array2)));
	}

	private static int[] startTwoFingerAlgorithm(int[] array1, int[] array2) {
		int[] arrayResult = new int[array1.length + array2.length];
		int indexOfArray1 = 0;
		int indexOfArray2 = 0;
		for (int i = 0; i < arrayResult.length; i++) {
			if (indexOfArray1 < array1.length && array1[indexOfArray1] < array2[indexOfArray2]) {
				arrayResult[i] = array1[indexOfArray1++];
			} else {
				if (indexOfArray2 < array2.length)
					arrayResult[i] = array2[indexOfArray2++];
			}
		}

		return arrayResult;

	}

}
