package random;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int [] people = new int[15];
		int luckyNum = 0;
		
		for (int i = 0; i<people.length; i++) {
			System.out.println(i+"번째 사람 입력하세요: ");
			luckyNum = sc.nextInt();
			people[i] += luckyNum;
		}
		
		int randomNum1 = rd.nextInt(15 + 1);
		int randomNum2 = rd.nextInt(15 + 1);
		
		for (int j = 0; j<people.length; j++) {
			if (randomNum1 == people[j]) {
				System.out.println(people[j]+"번 입력한 사람 당첨!");
			}
			
			if (randomNum2 == people[j]) {
				System.out.println(people[j]+"번 입력한 사람 당첨!");
			}
		}
		
	}

}
