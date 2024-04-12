package study;

import java.util.Scanner;

//문제점 리본 아래가 출력이 안됨

public class ribon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		for (int i = 0; i <= num; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= num-i; m++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = num; i >= 0; i--) {
			for (int k = 1; k > 1; k++) {
				System.out.print("*");
			}
			for (int j = 1; j <= num-1; j++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= num-1; m++) {
				System.out.print(" ");
			}
			for (int l = 1; l > 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
