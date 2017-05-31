package main;

public class Pyramid {
	
	public static void printPyramid(int n) {
		for (int i = 0; i < n; i++) {
			int pad = n - i;
			System.out.printf("%"+pad+"s", "#");
			for (int j = 0; j < (n - pad); j++) {
				System.out.printf("%s", "#");
			}
			System.out.println();
		}
	}
	
	public static String[] pyramidLeft(int n) {
		String[] pyramid = new String[n];
		for (int i = 0; i < n; i++) {
			int pad = n - i;
			pyramid[i] = "#";
			String temp = "";
			for (int j = 0; j < (n - pad); j++) {
				temp += "#";
			}
			pyramid[i] += temp;
		}
		return pyramid;
	}
	
	public static String[] pyramidRight(int n) {
		String[] pyramid = new String[n];
		for (int i = 0; i < n; i++) {
			int pad = n - i;
			pyramid[i] = String.format("%"+pad+"s", "#");
			String temp = "";
			for (int j = 0; j < (n - pad); j++) {
				temp += "#";
			}
			pyramid[i] += temp;
		}
		return pyramid;
	}
	
	public static void main(String[] args) {
		printPyramid(5);
		String[] pyramid = pyramidLeft(2);
		for (int i = 0; i < pyramid.length; i++) {
			System.out.printf("%s\n", pyramid[i]);
		}
		String[] pyramidRight = pyramidRight(2);
		for (int j = 0; j < pyramidRight.length; j++) {
			System.out.printf("%s\n", pyramidRight[j]);
		}
	}

}
