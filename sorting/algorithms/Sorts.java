package algorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Sorts {
	public interface Sortable {
		public void sort(int[] arr);
	}
	

	
	private static void shuffleInput(int[] arr) {
		int randomNum = 0;
		int temp = 0; 
		
		for(int i = 0; i < arr.length; i++) {
			do {
				randomNum = ThreadLocalRandom.current().nextInt(0, arr.length);
			} while (randomNum == i);
			temp = arr[i];
			arr[i] = arr[randomNum];
			arr[randomNum] = temp;
		}
	}
	
	public static void printResult(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void tenTests(Sortable sortable, int[] arr) {
		long time = 0;
		long start = 0;
		for (int i = 0; i < 1000; i++) {
			shuffleInput(arr);
			//printResult(arr);
			start = System.nanoTime();
			sortable.sort(arr);
			time += System.nanoTime() - start;
			//printResult(arr);
		}
		System.out.println((double)time / 1000000000.0);
	}
	
	protected abstract void sort(int[] arr);
	protected void init(Sortable sort, int[] arr) {
		sort.sort(arr);
		printResult(arr);
		tenTests(sort, arr);
	}
	
	
}
