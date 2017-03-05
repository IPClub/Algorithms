
public class PeakFinder {

	final static int arraySize = 100;
	public static void main(String[] args) {
		int[] a = new int[arraySize];
		for(int i=0;i<a.length-1;i++){
			a[i] = i+1;
		}
		System.out.println("-----starting peakFinder1-----");
		long start1 = System.currentTimeMillis();
		peakFinder1(a);		
		long end1 = System.currentTimeMillis();
		System.out.println("----peakFinder1 end time =  " + ((double)end1-start1)/1000 + " seconds");
		
		System.out.println("-----starting peakFinder2-----");
		long start2 = System.currentTimeMillis();
		peakFinder2(a,0,a.length-1);		
		long end2 = System.currentTimeMillis();
		System.out.println("----peakFinder2 end time =  " + ((double)end2-start2)/1000 + " seconds");
	}

	public static void peakFinder1(int[] array) {
		if(array[0]>=array[1]){
			System.out.println("peak finder 1 : " + array[0]);
			return;
		}
		
		if(array[array.length-1]>=array[array.length-2]){
			System.out.println("peak finder 1 : " + array[array.length-1]);
			return;
		}
		
		for(int i=1;i<array.length-1;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(array[i] >= array[i-1] && array[i] >= array[i+1]){
				System.out.println("peak finder 1 : " + array[i]);
				return;
			}
		}
	}

	public static void peakFinder2(int[] array,int startIndex,int endIndex) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int midleIndex = (startIndex+endIndex)/2;
		if(array[midleIndex]<array[midleIndex+1]){
			peakFinder2(array,midleIndex+1,array.length-1);
		}else{
			if(array[midleIndex]<array[midleIndex-1]){
				peakFinder2(array,0,midleIndex-1);
			}else{
				System.out.println("peak finder 2 : " + array[midleIndex]);
				return;
			}
		}
	}
}
