package main;

public class SumArray {
	
	public static int sumArray(int[] arr) {
		int sum = arr[0];
		for (int i = 1; i <arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums = {3, 5, 2, 7, 9, 4, 66, 3, 88};
		int sum = sumArray(nums);
		
		System.out.printf("%d\n", sum);
	}

}
