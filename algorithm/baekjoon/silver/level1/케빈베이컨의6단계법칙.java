package algorithm.baekjoon.silver.level1;

import java.util.Scanner;

public class 케빈베이컨의6단계법칙 {
    static final int INF = 987654321;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[][] arr = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = INF;

                if (i == j) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            arr[A][B] = 1;
            arr[B][A] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (arr[j][k] > arr[j][i] + arr[i][k]) {
                        arr[j][k] = arr[j][i] + arr[i][k];
                    }
                }
            }
        }

        int min = Integer.MAX_VALUE;
        int answer = -1;

        for (int i = 1; i <= N; i++) {
            int total = 0;
            for (int j = 1; j <= N; j++) {
                total += arr[i][j];
            }
            if (total < min) {
                answer = i;
                min = total;
            }
        }

        System.out.println(answer);
    }
}
