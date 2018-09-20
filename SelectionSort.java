public class SelectionSort implements SortingAlgorithm {

	public void sort(int [] a) {
		selectionSort(a);
	}

	public void selectionSort(int [] a) {
		/* Iterate through array */
		for(int i = 0; i < a.length-1; i++) {
			/* findMin of current array, swap place with current value */
			swap(i, findMin(i, a), a);
		}
	}

	public int findMin(int start, int [] a) {
		int min = start;
		/* Iterate through array to find index of smallest val */
		for(int i = start+1; i < a.length; i++) {
			if(a[i] < a[min]) {
				min = i;
			}
		}
		return min;
	}


	public void swap(int x, int y, int [] a) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}