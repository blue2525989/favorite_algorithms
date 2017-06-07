package main;

public class MergeArray {
	
	// merge two arrays
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
	
	// merge and sort two arrays
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

	// merge three arrays
	public static int[] mergeArrays(int[] nums1, int[] nums2, int[] nums3) {
		int size = nums1.length + nums2.length + nums3.length;
		int[] finalNums = new int[size];
		for (int i = 0; i < nums1.length; i++) {
			finalNums[i] = nums1[i];
		}
		int num1L = nums1.length;
		for (int i = 0; i < nums2.length; i++) {
			finalNums[num1L + i] = nums2[i];
		}
		int num2L = nums2.length;
		for (int i = 0; i < nums3.length; i++) {
			finalNums[num2L + i] = nums3[i];
		}
		return finalNums;
	}
	
	// merge and sort three arrays
	public static int[] mergeArraysSort(int[] nums1, int[] nums2, int[] nums3) {
		int size = nums1.length + nums2.length + nums3.length;
		int[] finalNums = new int[size];
		for (int i = 0; i < nums1.length; i++) {
			finalNums[i] = nums1[i];
		}
		int num1Len = nums1.length;
		for (int i = 0; i < nums2.length; i++) {
			finalNums[num1Len + i] = nums2[i];
		}
		int num2L = nums2.length;
		for (int i = 0; i < nums3.length; i++) {
			finalNums[num2L + i] = nums3[i];
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
	
	// merge four arrays
	public static int[] mergeArrays(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		int size = nums1.length + nums2.length + nums3.length + nums4.length;
		int[] finalNums = new int[size];
		for (int i = 0; i < nums1.length; i++) {
			finalNums[i] = nums1[i];
		}
		int num1L = nums1.length;
		for (int i = 0; i < nums2.length; i++) {
			finalNums[num1L + i] = nums2[i];
		}
		int num2L = nums2.length;
		for (int i = 0; i < nums3.length; i++) {
			finalNums[num2L + i] = nums3[i];
		}
		int num3L = nums3.length;
		for (int i = 0; i < nums4.length; i++) {
			finalNums[num3L + i] = nums4[i];
		}
		return finalNums;
	}
	
	// merge and sort four arrays
	public static int[] mergeArraysSort(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		int size = nums1.length + nums2.length + nums3.length + nums4.length;
		int[] finalNums = new int[size];
		for (int i = 0; i < nums1.length; i++) {
			finalNums[i] = nums1[i];
		}
		int num1L = nums1.length;
		for (int i = 0; i < nums2.length; i++) {
			finalNums[num1L + i] = nums2[i];
		}
		int num2L = nums2.length;
		for (int i = 0; i < nums3.length; i++) {
			finalNums[num2L + i] = nums3[i];
		}
		int num3L = nums3.length;
		for (int i = 0; i < nums4.length; i++) {
			finalNums[num3L + i] = nums4[i];
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
		int[] q = {1532, 3325, 3523, 6435, 2353, 3857, 3253};
		int[] w = {152, 325, 523, 645, 253, 857, 253};
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

		System.out.println();
		
        z = mergeArrays(x, y, w);
		
		for (int i = 0; i < z.length; i++) {
			System.out.println("z[" + i + "] = " + z[i]);
		}
		
		System.out.println();
		
		z = mergeArraysSort(x, y, w);
		
		for (int i = 0; i < z.length; i++) {
			System.out.println("z[" + i + "] = " + z[i]);
		}
		
		System.out.println();
		
        z = mergeArrays(x, y, w, q);
		
		for (int i = 0; i < z.length; i++) {
			System.out.println("z[" + i + "] = " + z[i]);
		}
		
		System.out.println();
		
		z = mergeArraysSort(x, y, w, q);
		
		for (int i = 0; i < z.length; i++) {
			System.out.println("z[" + i + "] = " + z[i]);
		}
	}
}
