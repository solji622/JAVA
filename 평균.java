package array;

import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] score = new int[N];
		double avg, sum = 0.0;
		
		for (int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
		}
		
		int M = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if (M < score[i]) {
				M = score[i];
			}
		}

		for (int i = 0; i < score.length; i++) {
			avg = (score[i] / M) * 100;
			sum += avg;
		}
		
		System.out.println(sum / N);
	}

}
