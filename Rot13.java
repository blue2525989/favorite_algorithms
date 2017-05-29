package main;

public class Rot13 {
	
	public static int rot13(int n) {
		if (n >= 'A' && n <= 'Z') {
			n = (((n-'A')+13)%26)+'A';
		}
		if (n >= 'a' && n <= 'z') {
			n = (((n-'a')+13)%26)+'a';
		}
		return n;
	}
	
	public static int rot13_2(int n) {
		return (n >= 'A' && n <= 'Z') ? 
				n = (((n - 'A') + 13) % 26) + 'A' :	(n = (n >= 'a' && n <= 'z') ?
							n = (((n - 'a') + 13) % 26) + 'a' : n);
	}
	
	public static String rot13String(String s) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {
			s += (char)rot13(chars[i]);
		}
		return s;
	}
	
	public Rot13() {
		for (int i = 0; i < 100; i++) {
			double rand = Math.random();
			int rando = (int) (rand * 100);
			System.out.printf("%s\n", (char)rot13_2(rando));
		}
		
	}
	
	public static void main(String[] args) {
		new Rot13();
	}

}
