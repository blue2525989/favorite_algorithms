package main;

public class Fibonacci {
	
	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
	
	public static int fibPro(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		int fib1 = 1, fib2 = 1, fibMain = 1;
		for (int i = 3; i <= n; i++) {
			fibMain = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibMain;
		}
		return fibMain;
	}
	
	public static void main(String[] args) {
		int fib = fib(23);
		int fibPro = fibPro(23);
		
		System.out.printf("recursion %d\nprocedural %d\n", fib, fibPro);
	}

}
