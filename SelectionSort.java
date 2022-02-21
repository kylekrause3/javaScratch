public class SelectionSort {
	int[] arr;
	
	public SelectionSort(int[] arr) {
		this.arr = arr;
	}
	
	
	//going through array to find smallest number, replacing the first, and such
	public void sort_s2L() {
		int cache;
		int small;
		
		for(int i = 0; i < arr.length - 1; i++) {
			small = i;
			cache = arr[i];
			
			int j;
			for(j = i + 1; j != arr.length ; j++) {
				if(arr[j] < arr[small]) {
					
					small = j;
				}
			}
			
			cache = arr[small];
			arr[small] = arr[i];
			arr[i] = cache;
			
		}
	}
	
	public int[] getArray() {
		return arr;
	}
	
	public String toString() {
		String ret = "";
		
		int i;
		for(i = 0; i < arr.length - 1; i++) {
			ret += arr[i] + ", ";
		}
		ret += arr[i];
		
		return ret;
	}
}