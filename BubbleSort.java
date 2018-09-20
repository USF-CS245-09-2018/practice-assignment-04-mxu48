public class BubbleSort implements SortingAlgorithm {

	public void sort (int [] a) {
		bubbleSort(a);
	}

	public void bubbleSort(int [] a) {
		/* To control sorting */
		for(int j = 0; j < a.length-1; j++) {
			/* To iterate through array, stopping before already sorted end */
			for(int i = 0; i < a.length-1-j; i++) {	
				/* If current < next, swap */
				if(a[i] > a[i+1]) {
					swap(i, i+1, a);
				}
			}
		}
	} /* Close bubbleSort */


	public void swap(int x, int y, int [] a) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}