package main;

import java.util.*;

public class CountingChars2 {

	public static HashMap<Character, Integer> countChars(String s) {
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		
		char[] chars = s.toCharArray();
		
		for (char c : chars) {
			if (!counts.containsKey(c)) {
				counts.put(c, 1);
			}
			else {
				int x = counts.get(c);
				counts.put(c, x+1);
			}
		}		
		return counts;
	}
	
	public static HashMap<Character, Integer> countChars2(String s) {
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (!counts.containsKey(chars[i])) {
				counts.put(chars[i], 1);
			}
			else {
				int x = counts.get(chars[i]);
				counts.put(chars[i], x+1);
			}
		}
		return counts;
	}
	
	public static void main(String[] args) {
		String str = "Jason is super duper cool and an awesome programmer!";
		HashMap<Character, Integer> counts = countChars(str); 
		for(Character c : counts.keySet()) {
			System.out.printf("%s : %d\n", c, counts.get(c));
		}
		HashMap<Character, Integer> counts2 = countChars(str); 
		for (Character c : counts2.keySet()) {
			System.out.printf("%s : %d\n", c, counts2.get(c));
		}
	}
	
}
