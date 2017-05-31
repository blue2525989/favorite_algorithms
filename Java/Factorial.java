package main;

public class Factorial {
	
	// recursive factorial method, n * n1, n * n2, n * n3, ..., ...., n * n6
	public static int factorial(int n) {
		if (n > 1) {
			n = n * factorial(n - 1);
			return n;
		}		
		return n;
	}
	
	public static void main(String[] args) {
		int fact1 = factorial(2);
		int fact2 = factorial(3);
		int fact3 = factorial(4);
		int fact4 = factorial(5);
		int fact5 = factorial(6);
		int fact6 = factorial(7);
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n", fact1, fact2, fact3, fact4, fact5, fact6);
	}

}
