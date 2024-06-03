import java.util.Arrays;

public class test02 {
    public static void main(String[] args) {
        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};

        System.out.println(solution(arrA, arrB));
    }

    public static String solution(int[] arrA, int[] arrB){
        int[] resArr = new int[arrA.length + arrB.length];
        int index = 0;
        for (int i = 0; i < arrA.length; i++) {
            resArr[index++] = arrA[i];
        }
        for (int i = 0; i < arrB.length; i++) {
            resArr[index++] = arrB[i];
        }

        Arrays.sort(resArr);

        return Arrays.toString(resArr);
    }
}
