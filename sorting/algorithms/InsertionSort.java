package algorithms;

public class InsertionSort extends Sorts{
	public InsertionSort() {}
	public InsertionSort(int[] arr) {
		init(new InsertionSort()::sort, arr);
	}
	@Override
	protected void sort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				for (int k = i; k >= 0; k--) {
					if (arr[k] < arr[i + 1]) {
						temp = arr[k];
						arr[k] = arr[i + 1];
						arr[i + 1] = temp;
					} else
						break;
				}
			}
		}
	}
	
}
