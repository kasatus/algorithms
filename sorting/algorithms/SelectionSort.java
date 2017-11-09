package algorithms;

public class SelectionSort extends Sorts{

	public SelectionSort() {
	}
	
	public SelectionSort(int[] arr) {
		init(new SelectionSort()::sort, arr);
	}
	@Override
	protected void sort(int[] arr) {
		int temp = arr[0];
		int tempK = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			tempK = i;
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[tempK] > arr[k]) {
					tempK = k;
				}
			}
			temp = arr[tempK];
			arr[tempK] = arr[i];
			arr[i] = temp;
		}
		
	}

}
