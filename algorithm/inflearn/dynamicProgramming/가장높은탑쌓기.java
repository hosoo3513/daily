package algorithm.inflearn.dynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 가장높은탑쌓기 {
    static int dy[];

    public int solution(int[][] arr) {
        int answer = 0;

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        dy = new int[arr.length];
        dy[0] = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j][0] > arr[i][0] && arr[j][2] > arr[i][2] && dy[j] > max) {
                    max = dy[j];
                }
                dy[i] = max + arr[i][1];
                answer = Math.max(answer, dy[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        가장높은탑쌓기 g = new 가장높은탑쌓기();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(g.solution(arr));
    }
}
