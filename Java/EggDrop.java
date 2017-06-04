package main;

import java.util.HashMap;

public class EggDrop {
	
	public int eggDrop(int n, int floors) {
		int count = 0;
		for (int i = 0; i < floors; i++) {
			if (i < n) {
				count++;
			}
		}
		return count;
	}
	
	public HashMap<Character, Integer> countChars(String str) {
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();
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
	
	public static double burnTime(double rope) {
		/* I think to solve this I would cut the rope
		 * in half and let it burn, then I would be able to 
		 * tell when it gets half way */		
		double ropeA = rope/2, ropeB = rope/2;
		double rand = Math.random();
		int rando = (int) (rand * (rope/2));
		ropeA -= rando;
		double diff = ropeB/ropeA;
		return diff;
	}

	public static void main(String[] args) {
		double rope = 15;
		
		System.out.println(rope = burnTime(rope));
		
	}
}
