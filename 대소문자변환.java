package study;

import java.util.Scanner;

public class Stringtransform {

	public static void main(String[] args) {
//		String str1 = "ApPle";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char c [] = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			if (c[i] >= 97 && c[i] <= 122) {
				c[i] = Character.toUpperCase(c[i]);
			} else {
				c[i] = Character.toLowerCase(c[i]);
			}
		}
		
		
		System.out.println(c);

	}

}
