package main;

public class MergeArray {
	

	public static int[] mergeArrays(int[] nums1, int[] nums2) {
		int size = nums1.length + nums2.length;
		int[] finalNums = new int[size];
		for (int i = 0; i < nums1.length; i++) {
			finalNums[i] = nums1[i];
		}
		int num1Len = nums1.length;
		for (int i = 0; i < nums2.length; i++) {
			finalNums[num1Len + i] = nums2[i];
		}
		return finalNums;
	}
	
	public static int[] mergeArraysSort(int[] nums1, int[] nums2) {
		int size = nums1.length + nums2.length;
		int[] finalNums = new int[size];
		for (int i = 0; i < nums1.length; i++) {
			finalNums[i] = nums1[i];
		}
		int num1Len = nums1.length;
		for (int i = 0; i < nums2.length; i++) {
			finalNums[num1Len + i] = nums2[i];
		}
		for (int i = 0; i < finalNums.length; i++) {
			for (int j = 0; j < finalNums.length-1; j++) {
				if (finalNums[j] > finalNums[j+1]) {
					int temp = finalNums[j];
					finalNums[j] = finalNums[j+1];
					finalNums[j+1] = temp;
				}
			}
		}
		return finalNums;
	}

	
	public static void main(String[] args) {
		int[] x = {12, 32, 23, 64, 23, 87, 23};
		int[] y = {0, 32, 15, 21, 53, 38};
		
		int[] z = mergeArrays(x, y);
		
		for (int i = 0; i < z.length; i++) {
			System.out.println("z[" + i + "] = " + z[i]);
		}
		
		System.out.println();
		
		z = mergeArraysSort(x, y);
		
		for (int i = 0; i < z.length; i++) {
			System.out.println("z[" + i + "] = " + z[i]);
		}
	}
}
