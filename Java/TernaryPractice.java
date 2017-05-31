package main;

import java.util.HashMap;

public class TernaryPractice {
	
	/**
	 *  Ternary fibonocci
	 * @param int n is a number
	 * @return uses ternary operator to check if
	 * n <= 2, if so it returns 1, other wise
	 * it returns fibonocci(n-1) + fibonocci(n-2)
	 */
	
	public static int fibonocci(int n) {		
		return (n = (n <= 2) ? 1 : fibonocci(n-1) + fibonocci(n-2));
	}
	
	/**
	 * Procedural fibonocci
	 * @param n is a number
	 * @return if n is <= 2, it returns 1,
	 * other wise it creates 3 integers 
	 * fib1, fib2, fibMain all set to 1
	 * then a for loop for i < n
	 * computes fibonocci
	 * returns fibMain after loop
	 */
	
	public static int fibonocciProc(int n) {
		if (n <= 2) {
			return 1;
		}
		int fib1 = 1, fib2 = 1, fibMain = 1;
		for (int i = 0; i < n; i++) {
			fibMain = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibMain;
		}
		return fibMain;
	}
	
	/**
	 * Factorial using recursion and ternary operator
	 * @param n is a number
	 * @return uses ternary to check if n <= 1, if so
	 * it returns n, other wise it returns 
	 * n * factorial(n-1) 
	 */
	
	public static int factorial(int n) {
		return (n = (n <= 1) ? n : (n *= factorial(n - 1)));
	}
	
	/**
	 * MaxIdx
	 * uses ternary to check if max < arr[i], if so
	 * it will set max and idx to their new values
	 * @param arr an array of numbers
	 * @return idx of largest element
	 */
	
	public static int maxIdx(int[] arr) {
		int idx = 0;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			idx = (max < arr[i]) ? (idx = i) & (max = arr[i]) : idx;
		}
		return idx;		
	}
	
	/**
	 * CountHoles
	 * finds the numbers that contain a hole " 4, 6, 8, 9, 0"
	 * @param n a number
	 * @return count 
	 */
	
	public static int countHoles(int n) {
		int count = 0;
		String temp = n+"";
		char[] chars = temp.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			count = (chars[i] == '4' || chars[i] == '6' || chars[i] == '8' || chars[i] == '9' || chars[i] == '0') 
					? count += 1 : count;
		}
		return count;
	}
	
	/**
	 * BubbleSort
	 * uses ternary to check if arr[j] > arr[j+1] if so,
	 * it assigns temp = arr[j], arr[j] = arr[j+1], arr[j+1] = temp
	 * other wise arr[j] stays the same
	 * @param arr an array of numbers
	 * @return the sorted array
	 */
	
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				int temp = (arr[j] > arr[j+1]) ? (temp = arr[j]) & (arr[j]=(arr[j+1])) & (arr[j+1]=temp) 
						: arr[j];
			}
		}
		return arr;
	}
	
	/**
	 * CountChars
	 * counts the characters in a String and returns 
	 * as a HashMap. uses ternary to check if counts does not
	 * contain chars[i] if not it puts it, other wise it
	 * will get its current count and put it again + 1
	 * @param s a String
	 * @return HashMap counts
	 */
	
	public static HashMap<Character, Integer> countChars(String s) {
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int x = counts.get(chars[i]);
			chars[i] = (char) ((!counts.containsKey(chars[i])) ? counts.put(chars[i], 1) : 
				(x = counts.get(chars[i])) & (counts.put(chars[i], x+1)));
		}
		return counts;
	}
	
	/**
	 * SortStringArray
	 * uses the ternary to check arr[j].compareTo(arr[j+1]) for lexiographical
	 * numbers to see which is larger. if it is > 0, it uses
	 * String.format( temp = arr[j], arr[j] = arr[j+1], arr[j+1] = temp )
	 * other wise String temp is = "" an empty String
	 * @param arr Array of Strings
	 * @return sorted Array
	 */
	
	public static String[] bubbleSortString(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				String temp = (arr[j].compareTo(arr[j+1]) > 0) ? 
						String.format(temp=arr[j],arr[j]=arr[j+1],arr[j+1]=temp) : "";
			}
		}
		return arr;
	}
	
	/**
	 * SuperBubbleSort
	 * takes a String[] as input and then sorts each String alphabetically 
	 * then it sorts all strings alphabetically 
	 * @param arr a String []
	 * @return super sorted array
	 */
	
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
	
	/**
	 * FizzBuzz
	 * uses the ternary to check if i%5==0 && i%3==0
	 * if so temp = FizzBuzz, other wise it checks i again
	 * if i%5==0 then Fizz, other wise it checks i again 
	 * if i%3==0 then Buzz, other wise it prints i
	 * @param n a number
	 */
	
	public static void fizzBuzz(int n) {
		for (int i = 1; i < n; i++) {
			String temp = (i%5==0 && i%3==0) ? ("FizzBuzz") : 
							(temp = (i%5==0) ? ("Fizz") : 
							(temp = (i%3==0) ? ("Buzz") : ""+i));
			System.out.printf("%s\n", temp);
		}
	}
	
	/********************* ENCRYPTION METHODS *************************/
	
	/**
	 * rot13
	 * rotates character by 13 characters
	 * @param n a number or character
	 * @return the number rotated 13 spaces
	 */
	
	public static int rot13(int n) {
		return (n >= 'A' && n <= 'Z') ? 
				n = (((n - 'A') + 13) % 26) + 'A' :	(n = (n >= 'a' && n <= 'z') ?
							n = (((n - 'a') + 13) % 26) + 'a' : n);
	}
	
	/**
	 * unRot13
	 * un-rotates a character by 13
	 * @param n a character to un-rotate
	 * @return un-rotated character
	 */
	
	public static int unRot13(int n) {
		return (n >= 'A' && n <= 'Z') ?
				n = (((n - 'Z') - 13) % 26) + 'Z' : (n = (n >= 'a' && n <= 'z') ? 
						n = (((n - 'z') - 13) % 26) + 'z' : n);
	}
	
	/**
	 * rot13String
	 * rotate a String each character by 13
	 * @param s String to rotate
	 * @return rotated String
	 */
	
	public static String rot13String(String s) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {
			s += (char)rot13(chars[i]);
		}
		return s;
	}

	/**
	 * unRot13String
	 * un-rotates a String each character by 13
	 * @param s String to rotate
	 * @return un-rotated String
	 */
	
	public static String unRot13String(String s) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {
			s += (char)unRot13(chars[i]);
		}
		return s;
	}
	
	/**
	 * rot13
	 * rotates character by 13 characters
	 * @param n a number or character
	 * @param xtra is an extra parameter to add another layer
	 * @return the number rotated 13 spaces
	 */
	
	public static int rot13(int n, int xtra) {
		return (n >= 'A' && n <= 'Z') ? 
				n = ((((n + xtra) - 'A') + 13) % 26) + 'A' : (n = (n >= 'a' && n <= 'z') ?
							n = ((((n + xtra) - 'a') + 13) % 26) + 'a' : n);
	}
	
	/**
	 * unRot13
	 * un-rotates a character by 13
	 * @param n a character to un-rotate
	 * @param xtra is an extra parameter to add another layer
	 * @return un-rotated character
	 */
	
	public static int unRot13(int n, int xtra) {
		return (n >= 'A' && n <= 'Z') ?
				n = ((((n - xtra) - 'Z') - 13) % 26) + 'Z' : (n = (n >= 'a' && n <= 'z') ? 
						n = ((((n - xtra) - 'z') - 13) % 26) + 'z' : n);
	}
	
	/**
	 * rot13String
	 * rotate a String each character by 13
	 * @param s String to rotate
	 * @param xtra is an extra parameter to add another layer
	 * @return rotated String
	 */
	
	public static String rot13String(String s, int xtra) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {
			s += (char)rot13(chars[i], xtra);
		}
		return s;
	}

	/**
	 * unrot13String
	 * rotate a String each character by 13
	 * @param s String to rotate
	 * @param xtra is an extra parameter to add another layer
	 * @return rotated String
	 */
	
	public static String unRot13String(String s, int xtra) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {
			s += (char)unRot13(chars[i], xtra);
		}
		return s;
	}
	
	/**
	 * rotAny
	 * rotates a character by any number
	 * @param n character
	 * @param offset number to rotate by
	 * @return rotated character
	 */
	
	public static int rotAny(int n, int offset) {
		return (n >= 'A' && n <= 'Z') ? 
				n = (((n - 'A') + offset) % 26) + 'A' :	(n = (n >= 'a' && n <= 'z') ?
							n = (((n - 'a') + offset) % 26) + 'a' : n);
	}
	
	/**
	 * unRotAny
	 * un-rotates a character by any number
	 * @param n character
	 * @param offset number to rotate by
	 * @return un-rotated character
	 */
	
	public static int unRotAny(int n, int offset) {
		return (n >= 'A' && n <= 'Z') ? 
				n = (((n - 'Z') - offset) % 26) + 'Z' :	(n = (n >= 'a' && n <= 'z') ?
							n = (((n - 'z') - offset) % 26) + 'z' : n);
	}
	
	/**
	 * rotateAnyString
	 * rotates a string by any number 
	 * @param s String to rotate
	 * @param offset number to rotate by
	 * @return rotated String
	 */
	
	public static String rotAnyString(String s, int offset) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {			
			s += (char)rotAny(chars[i], offset);
		}
		return s;
	}
	
	/**
	 * un-rotateAnyString
	 * un-rotates a String by any number 
	 * @param s String to un-rotate
	 * @param offset number to rotate by
	 * @return un-rotated String
	 */
	
	public static String unrotAnyString(String s, int offset) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {			
			s += (char)unRotAny(chars[i], offset);
		}
		return s;
	}
	
	/**
	 * rotAny
	 * rotates a character by any number
	 * @param n character
	 * @param offset number to rotate by
	 * @param xtra is an extra parameter to add another layer
	 * @return rotated character
	 */
	
	public static int rotAny(int n, int offset, int xtra) {
		return (n >= 'A' && n <= 'Z') ? 
				n = ((((n + xtra) - 'A') + offset) % 26) + 'A' : (n = (n >= 'a' && n <= 'z') ?
							n = ((((n + xtra) - 'a') + offset) % 26) + 'a' : n);
	}
	
	/**
	 * unRotAny
	 * un-rotates a character by any number
	 * @param n character
	 * @param offset number to rotate by
	 * @param xtra is an extra parameter to add another layer
	 * @return un-rotated character
	 */
	
	public static int unRotAny(int n, int offset, int xtra) {
		return (n >= 'A' && n <= 'Z') ? 
				n = ((((n - xtra) - 'Z') - offset) % 26) + 'Z' : (n = (n >= 'a' && n <= 'z') ?
							n = ((((n - xtra) - 'z') - offset) % 26) + 'z' : n);
	}
	
	/**
	 * rotateAnyString
	 * rotates a string by any number 
	 * @param s String to rotate
	 * @param offset number to rotate by
	 * @param xtra is an extra parameter to add another layer
	 * @return rotated String
	 */
	
	public static String rotAnyString(String s, int offset, int xtra) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {			
			s += (char)rotAny(chars[i], offset, xtra);
		}
		return s;
	}
	
	/**
	 * un-rotateAnyString
	 * un-rotates a String by any number 
	 * @param s String to un-rotate
	 * @param offset number to rotate by
	 * @param xtra is an extra parameter to add another layer
	 * @return un-rotated String
	 */
	
	public static String unrotAnyString(String s, int offset, int xtra) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {			
			s += (char)unRotAny(chars[i], offset, xtra);
		}
		return s;
	}
	
	/**
	 * rotateByWord
	 * takes a String and rotates it by another String
	 * @param s String to be encrypted
	 * @param key String to use as key
	 * @return encrypted String
	 */
	
	public static String rotateByWord(String s, String key) {
		char[] keys = key.toCharArray();
		char[] chars = s.toCharArray();
		s = "";
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = (count >= keys.length) ? count = 0 : count;
			char temp = (chars[i] >= 'A' && chars[i] <= 'Z') ?
					temp = (char) ((((chars[i] - 'A') + keys[count]) % 26) + 'A') :
						(temp = (chars[i] >= 'a' && chars[i] <= 'z') ?
								temp = (char) ((((chars[i] - 'a') + keys[count]) % 26) + 'a') : chars[i]);
			s += temp;
			count++;
		}
		return s;
	}
	
	/**
	 * unrotateByWord
	 * takes a String and rotates it by another String
	 * @param s String to be resolved  
	 * @param key String to use as key
	 * @return decrypted String
	 */
	
	public static String unrotateByWord(String s, String key) {
		char[] keys = key.toCharArray();
		char[] chars = s.toCharArray();
		s = "";
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = (count >= keys.length) ? count = 0 : count;
			char temp = (chars[i] >= 'A' && chars[i] <= 'Z') ?
					temp = (char) ((((chars[i] - 'Z') - keys[count]) % 26) + 'Z') :
						(temp = (chars[i] >= 'a' && chars[i] <= 'z') ?
								temp = (char) ((((chars[i] - 'z') - keys[count]) % 26) + 'z') : chars[i]);
			s += temp;
			count++;
		}
		return s;
	}
	
	/**
	 * rotateByWord
	 * takes a String and rotates it by another String
	 * @param s String to be encrypted
	 * @param key String to use as key
	 * @param xtra is an extra parameter to add another layer
	 * @return encrypted String
	 */
	
	public static String rotateByWord(String s, String key, int xtra) {
		char[] keys = key.toCharArray();
		char[] chars = s.toCharArray();
		s = "";
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = (count >= keys.length) ? count = 0 : count;
			char temp = (chars[i] >= 'A' && chars[i] <= 'Z') ?
					temp = (char) ((((chars[i] - 'A') + (keys[count]*xtra)) % 26) + 'A') :
						(temp = (chars[i] >= 'a' && chars[i] <= 'z') ?
								temp = (char) ((((chars[i] - 'a') + (keys[count]*xtra)) % 26) + 'a') : chars[i]);
			s += temp;
			count++;
		}
		return s;
	}
	
	/**
	 * unrotateByWord
	 * takes a String and rotates it by another String
	 * @param s String to be resolved  
	 * @param key String to use as key
	 * @param xtra is an extra parameter to add another layer
	 * @return decrypted String
	 */
	
	public static String unrotateByWord(String s, String key, int xtra) {
		char[] keys = key.toCharArray();
		char[] chars = s.toCharArray();
		s = "";
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = (count >= keys.length) ? count = 0 : count;
			char temp = (chars[i] >= 'A' && chars[i] <= 'Z') ?
					temp = (char) ((((chars[i] - 'Z') - (keys[count]*xtra)) % 26) + 'Z') :
						(temp = (chars[i] >= 'a' && chars[i] <= 'z') ?
								temp = (char) ((((chars[i] - 'z') - (keys[count]*xtra)) % 26) + 'z') : chars[i]);
			s += temp;
			count++;
		}
		return s;
	}

	/**
	 * rotateByWord
	 * takes a String and rotates it by another String
	 * @param s String to be encrypted
	 * @param key String to use as key
	 * @param xtra is an extra parameter to add another layer
	 * @return encrypted String
	 */
	// extra extra layer
	public static String rotateByWord(String s, String key, int xtra, int xtra2) {
		char[] keys = key.toCharArray();
		char[] chars = s.toCharArray();
		s = "";
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = (count >= keys.length) ? count = 0 : count;
			char temp = (chars[i] >= 'A' && chars[i] <= 'Z') ?
					temp = (char) ((((chars[i] - 'A') + ((keys[count]*xtra)%xtra2)) % 26) + 'A') :
						(temp = (chars[i] >= 'a' && chars[i] <= 'z') ?
								temp = (char) ((((chars[i] - 'a') + ((keys[count]*xtra)%xtra2)) % 26) + 'a') : chars[i]);
			s += temp;
			count++;
		}
		return s;
	}
	
	/**
	 * unrotateByWord
	 * takes a String and rotates it by another String
	 * @param s String to be resolved  
	 * @param key String to use as key
	 * @param xtra is an extra parameter to add another layer
	 * @return decrypted String
	 */
	// extra extra layer
	public static String unrotateByWord(String s, String key, int xtra, int xtra2) {
		char[] keys = key.toCharArray();
		char[] chars = s.toCharArray();
		s = "";
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = (count >= keys.length) ? count = 0 : count;
			char temp = (chars[i] >= 'A' && chars[i] <= 'Z') ?
					temp = (char) ((((chars[i] - 'Z') - ((keys[count]*xtra)%xtra2)) % 26) + 'Z') :
						(temp = (chars[i] >= 'a' && chars[i] <= 'z') ?
								temp = (char) ((((chars[i] - 'z') - ((keys[count]*xtra)%xtra2)) % 26) + 'z') : chars[i]);
			s += temp;
			count++;
		}
		return s;
	}
	
	public static void runMethods() {
		
		int fib01 = TernaryPractice.fibonocci(12);
		int fib02 = TernaryPractice.fibonocci(13);
		int fib03 = TernaryPractice.fibonocci(14);
		int fib04 = TernaryPractice.fibonocci(15);
		int fib05 = TernaryPractice.fibonocci(35);
		
		System.out.printf("%d, %d, %d, %d, %d\n", fib01, fib02, fib03, fib04, fib05);
		
		int fact01 = TernaryPractice.factorial(12);
		int fact02 = TernaryPractice.factorial(13);
		int fact03 = TernaryPractice.factorial(14);
		int fact04 = TernaryPractice.factorial(15);
		int fact05 = TernaryPractice.factorial(16);
		
		System.out.printf("%d, %d, %d, %d, %d\n", fact01, fact02, fact03, fact04, fact05);

		int[] arr1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] arr2 = {9, 5, 7, 3, 15, 2, 6};
		int[] arr3 = {2, 6, 4, 9, 4, 99, 3, 199, 100, 33, 101, 98, 55, 38, 123, 43, 75, 88, 124};
		
		int maxIdx01 = TernaryPractice.maxIdx(arr1);
		int maxIdx02 = TernaryPractice.maxIdx(arr2);
		int maxIdx03 = TernaryPractice.maxIdx(arr3);
	
		System.out.printf("%d, %d, %d\n",  maxIdx01, maxIdx02, maxIdx03);
		
		int hole01 = TernaryPractice.countHoles(91238902);
		int hole02 = TernaryPractice.countHoles(19890980);
		int hole03 = TernaryPractice.countHoles(999999999);
		int hole04 = TernaryPractice.countHoles(123456789);
		int hole05 = TernaryPractice.countHoles(999992222);

		System.out.printf("%d, %d, %d, %d, %d\n", hole01, hole02, hole03, hole04, hole05);
		
		int[] sort01 = TernaryPractice.bubbleSort(arr1);
		int[] sort02 = TernaryPractice.bubbleSort(arr2);
		int[] sort03 = TernaryPractice.bubbleSort(arr3);
		
		for (int i = 0; i < sort01.length; i++) {
			System.out.printf("%d ", sort01[i]);
		}
		System.out.println();
		
		for (int i = 0; i < sort02.length; i++) {
			System.out.printf("%d ", sort02[i]);
		}
		System.out.println();
		
		for (int i = 0; i < sort03.length; i++) {
			System.out.printf("%d ", sort03[i]);
		}
		System.out.println();
		
		String[] strings = {"rABAAA", "zz","ZZ","ZZ", "AAa", "AA", "vAAAz", "xAAAa", "zz", "gAAA", "AAAc",
				"Jason", "AAd", "AAAe", "jason", "Jason", "zz", "AAAd",
				"ZZs", "rAAAAAA", "c", "CC", "WWW", "z", "x", "e", "y", "f", "d", "w", "l", "a", 
				"v", "j", "k", "r", "q","jason", "AAAb", "AA", "A",
				"g", "h", "u", "i", "b", "k", "m", "h", "n", "<<", "?",
				"'", "^"};
		
		String[] sorted = TernaryPractice.bubbleSortString(strings);
		for (int i = 0; i < sorted.length; i++) {
			System.out.printf("%s %s\n", rot13String(sorted[i]), rot13String(rot13String(sorted[i])));
		}

		for (int i = 0; i < sorted.length -1; i++) {
			System.out.printf(TernaryPractice.rotateByWord(sorted[i], sorted[i+ 1]) + "\n");
		}
		
		for (int i = 0; i < sorted.length; i++) {
			System.out.printf("%s\n", sorted[i]);
		}
		String[] superSorted = TernaryPractice.bubbleSuperSortString(strings);
		for (int i = 0; i < superSorted.length; i++) {
			System.out.printf("%s\n", superSorted[i]);
		}
		
		System.out.printf("%s\n", TernaryPractice.rotateByWord("Jason loves programming!", "dog"));
		System.out.printf("%s\n", TernaryPractice.unrotateByWord(TernaryPractice.rotateByWord("Jason loves programming!", "dog"), "dog"));
		System.out.printf("%s\n", TernaryPractice.rotateByWord("Jason loves programming!", "fish"));
		System.out.printf("%s\n", TernaryPractice.rotateByWord("Jason loves programming!", "cat"));
		System.out.printf("%s\n", TernaryPractice.rotateByWord("Jason loves programming!", "goat"));
		System.out.printf("%s\n", TernaryPractice.rotateByWord("Jason loves programming!", "totes"));
		System.out.printf("%s\n", TernaryPractice.rotateByWord("Jason loves programming!", "horse"));
		System.out.printf("%s\n", TernaryPractice.unrotateByWord(TernaryPractice.rotateByWord("Jason loves programming!", "horse"), "horse"));
		System.out.printf("%s\n", TernaryPractice.rotateByWord("Jason loves programming!", "rosemary"));
		System.out.printf("%s\n", TernaryPractice.rotateByWord("Jason loves programming!", "awesome"));
		System.out.printf("%s\n", TernaryPractice.unrotateByWord(TernaryPractice.rotateByWord("Jason loves programming!", "awesome"), "awesome"));
		System.out.println();
		
		System.out.printf("%s\n", TernaryPractice.rotateByWord("Jason loves programming!", "awesome", 15));
		System.out.printf("%s\n", TernaryPractice.unrotateByWord(TernaryPractice.rotateByWord("Jason loves programming!", "awesome", 21), "awesome", 21));
		System.out.println();
		
		System.out.printf("%s\n", (char) TernaryPractice.rot13('w'));
		System.out.printf("%s\n", (char) TernaryPractice.unRot13(TernaryPractice.rot13('w')));
		System.out.println();
		
		System.out.printf("%s\n", TernaryPractice.rot13String("becki"));
		System.out.printf("%s\n", TernaryPractice.unRot13String(TernaryPractice.rot13String("becki")));
		System.out.println();
		
		System.out.printf("%s\n", TernaryPractice.rot13String("becki", 5));
		System.out.printf("%s\n", TernaryPractice.unRot13String(TernaryPractice.rot13String("becki", 5), 5));
		System.out.println();
		
		System.out.printf("%s\n", TernaryPractice.rot13String("becki", 3));
		System.out.printf("%s\n", TernaryPractice.unRot13String(TernaryPractice.rot13String("becki", 3), 3));
		System.out.println();
		
		System.out.printf("%s\n", (char) TernaryPractice.rotAny('w', 8));
		System.out.printf("%s\n", (char) TernaryPractice.unRotAny(TernaryPractice.rotAny('w', 8), 8));
		System.out.println();
		
		System.out.printf("%s\n", TernaryPractice.rotAnyString("Jason loves programming!", 19));
		System.out.printf("%s\n", TernaryPractice.unrotAnyString(TernaryPractice.rotAnyString("Jason loves programming!", 19), 19));
		System.out.println();

		System.out.printf("%s\n", TernaryPractice.rotAnyString("Jason loves programming!", 19, 4));
		System.out.printf("%s\n", TernaryPractice.unrotAnyString(TernaryPractice.rotAnyString("Jason loves programming!", 19, 4), 19, 4));
		System.out.println();
		
		System.out.printf("%s\n", TernaryPractice.rotateByWord("Jason loves programming!", "awesome", 15, 4));
		System.out.printf("%s\n", TernaryPractice.unrotateByWord(TernaryPractice.rotateByWord("Jason loves programming!", "awesome", 15, 4),
				"awesome", 15, 4));
		System.out.println();
		
		System.out.printf("%s\n", TernaryPractice.rotateByWord("Jason loves programming!", "awesome", 27, 22));
		System.out.printf("%s\n", TernaryPractice.unrotateByWord(TernaryPractice.rotateByWord("Jason loves programming!", "awesome", 27, 22),
				"awesome", 27, 22));
		System.out.println();
		
		System.out.printf("%s\n", TernaryPractice.rotateByWord("Jason loves programming!", "awesome", 15));
		System.out.printf("%s\n", TernaryPractice.unrotateByWord(TernaryPractice.rotateByWord("Jason loves programming!", "awesome", 15),
				"awesome", 15));
		System.out.println();
		
		System.out.printf("%s\n", (char) TernaryPractice.rot13('w'));
		
		/*
		TernaryPractice.fizzBuzz(6);
		TernaryPractice.fizzBuzz(16);
		TernaryPractice.fizzBuzz(26);
		TernaryPractice.fizzBuzz(36);
		TernaryPractice.fizzBuzz(46);
		TernaryPractice.fizzBuzz(56);
		*/
	}
	
	public TernaryPractice() {
		runMethods();
	}
	
	public static void main(String[] args) {
		new TernaryPractice();		
	}
}
