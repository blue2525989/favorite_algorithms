package main;

public class SumArrayEvens {
	
	public static int sumEvens(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums = {3, 4, 6, 3, 3, 3, 3, 3, 4};
		int sum = sumEvens(nums);
		System.out.printf("%d\n", sum);
	}

}
