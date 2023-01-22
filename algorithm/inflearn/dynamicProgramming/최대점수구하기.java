package algorithm.inflearn.dynamicProgramming;

import java.util.Scanner;

public class 최대점수구하기 {
    public int[] dy;

    public int solution(int arr[][], int limit) {
        dy = new int[limit + 1];

        for (int i = 0; i<arr.length; i++) {
            int ps = arr[i][0];
            int pt = arr[i][1];
            for (int j = limit; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }
        return dy[limit];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        최대점수구하기 main = new 최대점수구하기();
        int answer = main.solution(arr, m);

        System.out.println(answer);

    }
}
