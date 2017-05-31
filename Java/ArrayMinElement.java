package main;

public class ArrayMinElement {
	
	public static int minArray(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] nums = {3, 55, 1, 9, 55, 44, 88, -55};
		int min = minArray(nums);
		System.out.printf("%d\n", min);
	}

}
