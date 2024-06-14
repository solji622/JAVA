import java.util.Scanner;

public class paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("종이 수 입력: ");
        String[] strArr = sc.nextLine().split(" ");
        /*
        nextLine()은 한줄 단위로 입력을 받기에 개행문자(줄바꿈문자)도
        포함을 시킴 -> k(nextInt)를 먼저 입력받으면 nextLine()은
        nextInt()에서 정수를 가져오고 남은 \n(개행문자)를 가져오기에
        입력 받을 수가 없음 -> 그래서 종이 수부터 입력 받음
         */
        int[] papers = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            papers[i] = Integer.parseInt(strArr[i]);
        }

        System.out.print("k 입력: ");
        int k = sc.nextInt();

        System.out.println(solution(papers, k));
    }

    public static int solution(int[] papers, int k){
        int people = 0;
        for (int i = 0; i < papers.length; i++) {
            k -= papers[i];
            // 맨 앞사람에게 전달한 종이 수에서 각자 필요로 하는 종이 수만큼 빼고
            people++;
            // 종이 받은 사람들을 카운트함
            if(k < papers[i]){
                // 만약 필요로 하는 종이의 수보다 남은 종이의 수가 적다면 그만!!
                break;
            }
        }
        return people;
    }
}
