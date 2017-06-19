package main;

public class SumSquares {
	
	// iteration
	public static int sumSquares(int lo, int hi) {
		int sum = 0;
		for (int i = lo; i <= hi; i++) sum += i * i;
		return sum;
	}
	
	// going up
	public static int sumSquares2(int lo, int hi) {
		if (lo < hi) {
			return lo * lo + sumSquares(lo+1, hi);
		} 
		else {
			return lo * lo;
		}
	}
	
	// going down
	public static int sumSquares3(int lo, int hi) {
		if (hi > lo) {
			return sumSquares3(lo,hi-1) + hi * hi;
		}
		else {
			return hi * hi;
		}
	}
	
	// split into halves
	public static int sumSquares4(int lo, int hi) {
		int middle;
		if (lo == hi) {
			return lo * lo;
		}
		else {
			middle = (lo + hi) / 2;
			return sumSquares4(lo, middle) + sumSquares(middle + 1, hi);
		}
	}
	
	public static void main(String[] args) {
		// sum of squares 5-10 = 355
		
		// normal iteration
		System.out.println(sumSquares(5,10));

		// going up
		System.out.println(sumSquares2(5,10));
		
		// going down
		System.out.println(sumSquares3(5,10));
		
		// split into halves
		System.out.println(sumSquares4(5,10));
	}

}
