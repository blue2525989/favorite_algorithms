package main;

public class ArraySorting {
	
	// insert element into array
	public static int[] insert(int[] arr, int ele, int newNum) {
		int[] arr2 = new int[arr.length + 1];		
		for (int i = 0; i < arr2.length; i++) {
			if (i < ele) {
				arr2[i] = arr[i];
			}
			else if (i == ele) {
				arr2[i] = newNum;
			}
			else {
				arr2[i] = arr[i-1];
			}
		}		
		return arr2;
	}

	// insert element into array with ternary operator
	public static int[] insertElement(int[] arr, int ele, int newNum) {
		int[] arr2 = new int[arr.length + 1];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (i < ele) ? arr2[i] = arr[i] :
			(arr2[i] = (int) ((i == ele) ? (arr2[i] = newNum) : (arr2[i] = arr[i-1])));
		}
		return arr2;
	}
	
	// sort string array
	public static String[] bubbleSortString(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				String temp = (arr[j].compareTo(arr[j+1]) > 0) ? 
						String.format(temp=arr[j],arr[j]=arr[j+1],arr[j+1]=temp) : "";
			}
		}
		return arr;
	}
	
	// super bubble sort
	public static String[] bubbleSuperSortString(String[] arr) {
		String placeHolder = "";
		for (int i = 0; i < arr.length; i++) {
			char[] chars = arr[i].toCharArray();
			for (int j = 0; j < chars.length; j++) {
				for (int n = 0; n < chars.length-1; n++) {
					char temp = (char) ((chars[n] > chars[n+1]) ? 
							(temp = chars[n]) & (chars[n] = chars[n+1]) & (chars[n+1] = temp) : chars[n]);
					
				}	
				placeHolder += chars[j];
			}
			arr[i] = placeHolder;
			placeHolder = "";
		}		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				String temp = (arr[j].compareTo(arr[j+1]) > 0) ? 
						String.format(temp=arr[j],arr[j]=arr[j+1],arr[j+1]=temp) : "";
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int[] nums = new int[100];
		for (int i = 0; i < 100; i++) {
			double rand = Math.random();
			int temp = (int) (rand * 100);
			nums[i] = temp;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}
		System.out.println();
		int[] nums2 = new int[nums.length+1];
		nums2 = insert(nums, 5, 999);
		for (int i = 0; i < nums2.length; i++) {
			System.out.printf("%d ", nums2[i]);
		}
		System.out.println();
			
	}
}
