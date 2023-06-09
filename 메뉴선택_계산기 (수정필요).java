package tset;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 사칙연산 계산기 프로그램 (메뉴 입력받아 실행)
		Scanner scan = new Scanner(System.in);
		
		while (true) { // 조건 없는 반복 시 while
			System.out.println("---------------------");
			System.out.println("계산기 실행(1)  종료(2)");
			int a = scan.nextInt();
			System.out.println("---------------------");
		
			if(a == 1) {
				System.out.println("계산기 실행");
				System.out.print("숫자1 입력하기: ");
				int num1 = scan.nextInt();
				System.out.print("숫자2 입력하기: ");
				int num2 = scan.nextInt();
				System.out.println("메뉴 입력하기: ");
				int i = scan.nextInt();
				
				
				//switch 사용하기
				switch(i) {
				case 1:
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break;
				case 2:
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					break;
				case 3:
					System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
					break;
				case 4:
					System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
					break;
				default :
					System.out.println("메뉴 입력 오류!");
					break;
					// while문으로 돌아가는 게 아닌 switch문으로 돌아가게 수정해보기
				}
				
			
			} else if (a == 2) {
				System.out.println("계산기 종료");
				System.out.println("---------------------");
				break; // break 시 제일 가까운 반복문 탈출 (while 탈출)
			} else {
				System.out.println("숫자 입력 오류!");
				System.out.println("---------------------");
			}
		}
	
	}

}
