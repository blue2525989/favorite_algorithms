package main;

public class FizzBuzz {
	
	// fizzBuzz
	public static void fizzBuzz(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if (i%5==0) {
				System.out.println("Buzz");
			}
			else if (i%3==0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		int nums[] = new int[31];
		for (int i = 0; i < nums.length; i++) {
			double rando = Math.random() * 100;
			nums[i] = (int)rando;
		}
		
		fizzBuzz(nums);
	}

}
