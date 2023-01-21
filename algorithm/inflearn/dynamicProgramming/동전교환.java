package algorithm.inflearn.dynamicProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {
    public int solution(int[] arr, int money) {
        int answer = 0;

        Integer[] coin = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(coin, Collections.reverseOrder());

        for (int i = 0; i < coin.length; i++) {
            int tmp = money / coin[i];
            money -= (tmp * coin[i]);
            answer += tmp;
        }

        return answer;
    }

    public static void main(String[] args) {
        동전교환 m = new 동전교환();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int l = scan.nextInt();
        System.out.println(m.solution(arr, l));
    }
}
