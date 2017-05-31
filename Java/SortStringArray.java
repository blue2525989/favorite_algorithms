package main;

public class SortStringArray {
	
	// working sort strings lexicographically!!!! 
	public static String[] sortStrings(String[] arr) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i].compareTo(arr[i+1]) >= 1) {
					String temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		String[] strings = {"Jason", "jason", "AAA", "AA", "A", "AA", "AAA", "jason", "Jason"};
		String[] sorted = sortStrings(strings);
		for (int i = 0; i < sorted.length; i++) {
			System.out.printf("%s\n", sorted[i]);
		}
	}

}
