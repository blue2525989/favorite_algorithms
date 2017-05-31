package main;

public class SumArrayOdds {
	
	public static int sumOdds(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%3==0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 15, 15};
		int sum = sumOdds(nums);
		System.out.printf("%d\n", sum);
	}

}
