package ipc.am.sort;

import java.util.*;

public class MergeSort {
	public static void main(String[] args) {
		int[] list = { 14, 32, 67, 76, 23, 41, 58, 85 };
		System.out.println("before: " + Arrays.toString(list));
		mergeSort(list);
		System.out.println("after:  " + Arrays.toString(list));
	}

	public static void mergeSort(int[] array) {
		if (array.length > 1) {
			int[] left = leftHalf(array);
			int[] right = rightHalf(array);
			mergeSort(left);
			mergeSort(right);
			merge(array, left, right);
		}
	}

	public static int[] leftHalf(int[] array) {
		int size1 = array.length / 2;
		int[] left = new int[size1];
		for (int i = 0; i < size1; i++) {
			left[i] = array[i];
		}
		return left;
	}

	public static int[] rightHalf(int[] array) {
		int size1 = array.length / 2;
		int size2 = array.length - size1;
		int[] right = new int[size2];
		for (int i = 0; i < size2; i++) {
			right[i] = array[i + size1];
		}
		return right;
	}

	public static void merge(int[] result, int[] left, int[] right) {
		int i1 = 0;
		int i2 = 0;

		for (int i = 0; i < result.length; i++) {
			if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
				result[i] = left[i1];
				i1++;
			} else {
				result[i] = right[i2];
				i2++;
			}
		}
	}
}