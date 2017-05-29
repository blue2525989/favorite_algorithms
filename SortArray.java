package main;

public class SortArray {
	
	// working bubble sort!!!
	public static int[] sortArray(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] nums = {99, 55, 33, 66, 33, 66, 3, 7, 9, 33, 22, 9, 1, 5};
		int[] sorted = sortArray(nums);
		for (int i = 0; i < sorted.length; i++) {
			System.out.printf("%d ", sorted[i]);
		}
		System.out.println();
	}

}
