import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a를 입력해주세요: ");
		int a = sc.nextInt(); //숫자1
		
		System.out.print("b를 입력해주세요: ");
		int b = sc.nextInt(); //숫자2
		
		System.out.print("[+, -. *, /] 중 택 1: ");
		String c = sc.next(); //연산자
		
		switch (c) {
		case "+" :
			System.out.println(a + b);
			break; // 모든 케이스마다 break 걸기
		case "-" :
			System.out.println(a - b);
			break;
		case "*" :
			System.out.println(a * b);
			break;
		case "/" :
			System.out.println(a / b);
			break;

		default: // else와 같은 역할
			System.out.println("연산자 중에 하나만 입력해야지");
			break;
		}

	}

}
