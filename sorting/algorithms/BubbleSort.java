package algorithms;

import com.sun.tools.internal.xjc.model.SymbolSpace;

public class BubbleSort extends Sorts{
	public BubbleSort() {};
	public BubbleSort(int[] arr) {
		init(new BubbleSort()::sort, arr);
	}

	public void tenTests(int[] arr) {
		
	}
	
	@Override
	public void sort(int[] arr) {
		int temp = 0;
		for (int k = 0; k < arr.length - 2; k++) {
			for (int i = arr.length - 1; i > k; i--) {
				if (arr[i] < arr[i - 1]) {
					temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
				}
			}
		}
	}
}
