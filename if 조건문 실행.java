import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력해주세요");
		int N = sc.nextInt();
		if (N % 2 == 0) { // N / 2 의 나머지가 0이면
			System.out.println(N+" 짝수");
		} else {
			System.out.println(N+" 홀수");
		}
		//ctrl + / -> 주석처리 || /**/ -> 주석 열고 닫기
	}

}
