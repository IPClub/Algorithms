package ipc.am.sort;

import java.util.Random;

public class InsertionVSMergeVSHeap {

	static int[] array1;
	static int[] array2;
	static int[] array3;
	static int maxSize = 200000;
	public static void main(String[] args) {
		generateArrays();
		startSelectionSort();
		startMergeSort();	
		startHeapSort();
//		for(int i=0;i<100;i++){
//			System.out.print(array1[i] + " ");
//		}
//		System.out.println();
//		for(int i=0;i<100;i++){
//			System.out.print(array2[i] + " ");
//		}
	}
	private static void startSelectionSort() {
		System.out.println();
		System.out.println("-----starting selection sort-----");
		long start1 = System.currentTimeMillis();
		InsertionSort.startInsertionSort(array1);
		long end1 = System.currentTimeMillis();
		System.out.println("----selection sort end time =  " + ((double)end1-start1)/1000 + " seconds");
	}
	private static void startMergeSort() {
		System.out.println();
		System.out.println("-----starting Merge sort-----");
		long start1 = System.currentTimeMillis();
		MergeSort.mergeSort(array2);
		long end1 = System.currentTimeMillis();
		System.out.println("----Merge sort end time =  " + ((double)end1-start1)/1000 + " seconds");
	}
	
	private static void startHeapSort() {
		System.out.println();
		System.out.println("-----starting Heap sort-----");
		long start1 = System.currentTimeMillis();
		HeapSort.startInsertionSort(array3);
		long end1 = System.currentTimeMillis();
		System.out.println("----Heap sort end time =  " + ((double)end1-start1)/1000 + " seconds");
	}

	private static void generateArrays() {
		System.out.println("----Generating array of size " + maxSize + "----");
		Random r = new Random();
		array1 = new int[maxSize];
		array2 = new int[maxSize];
		array3= new int[maxSize];
		for(int i=0;i<maxSize;i++){
			int number =  r.nextInt(100000);
			array1[i] = number;
			array2[i] = number;
			array3[i] = number;
		}
		System.out.println("----Arrays are ready----");
		
	}

}
