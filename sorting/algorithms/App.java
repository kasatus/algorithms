package algorithms;

import java.util.concurrent.ThreadLocalRandom;

public class App {
	public static void main(String[] args) {
		//int[] arr = {1, 3, 4, 6, 2, 1};
		int[] arr = new int[1000];
		int randomNum = 0;
		int temp = 0; 
		
		for(int i = 0; i < arr.length; i++)
				arr[i] = ThreadLocalRandom.current().nextInt(0, arr.length);
		
		
		BubbleSort bs = new BubbleSort(arr);
		SelectionSort ss = new SelectionSort(arr);
		InsertionSort is = new InsertionSort(arr);
		
		
	}
}
