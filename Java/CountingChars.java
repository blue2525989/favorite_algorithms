package main;

import java.util.*;

public class CountingChars {
	
	
	public static HashMap<Character,Integer> getCharFreq(String s) {
		  HashMap<Character,Integer> charFreq = new HashMap<Character,Integer>();
		  if (s != null) {
			  char[] chars = s.toCharArray();
			  for (int i = 0; i < chars.length; i++) {
				  Integer count = charFreq.get(chars[i]);
				  // use ternary operator to determine count
				  int newCount = (count==null ? 1 : count+1);
				  charFreq.put(chars[i], newCount);
		    }
		  }
		  return charFreq;
		}
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		String jason = "Jason Jason Jason Jason is so cool fool i love the letter ooooo";
		HashMap<Character, Integer> chars = getCharFreq(jason);
		
		Set set = chars.keySet();
		Collection col = chars.values();
		
		Object[] obj1 = set.toArray();
		Object[] obj2 = col.toArray();
		
		for (int i = 0; i < chars.size(); i++) {
			System.out.printf("%s %d\n", obj1[i], obj2[i]);
		}
	}

}
