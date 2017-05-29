package main;

public class ArrayMaxElement {
	
	public static int maxArray(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] nums = {3, 2, 77, 44, 66, 33, 99, 66};
		int max = maxArray(nums);
		System.out.printf("%d\n", max);
		
	}

}
