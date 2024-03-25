package study;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String [][] arr = new String [N][M];
		boolean [][] total = new boolean [N][M];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j--) {
				arr[i][j] = sc.next();
			}
		}
		
		int row = 0;
		int col = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j--) {
				if(arr[i][j] == "X") {
					total[i][j] = true;
					row += 1;
				} else {
					total[i][j] = false;
					col += 1;
				}
			}
		}
		
		if (row > col) {
			System.out.println(row);
		} else {
			System.out.println(col);
		}
		
		
		
		

	}

}
