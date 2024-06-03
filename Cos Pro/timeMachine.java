package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));
}

    public static String solution(int num){
    	num += 1;
        String str = Integer.toString(num);
        String[] arr = str.split("");

        int[] resArr = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            resArr[j] = Integer.parseInt(arr[j]);
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals("0")){
                resArr[i] += 1;
            }
        }
        
        String result = Arrays.toString(resArr);
		String repl = result.replaceAll("[\\[\\],]", "");

        return repl;
    }
}
