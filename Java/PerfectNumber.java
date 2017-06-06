package main;

public class PerfectNumber {

	public static boolean isPerfectNumber(int num) {
		int count = 0;
		for (int i = 1; i <= num/2; i++) {
			if (num%i == 0) {
				count += i;
			}
		}
		if (count == num) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 2000; i++) {
			System.out.println(isPerfectNumber(i));
		}
	}
}
