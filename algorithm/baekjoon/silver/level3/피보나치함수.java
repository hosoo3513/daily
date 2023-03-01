package algorithm.baekjoon.silver.level3;

import java.util.Scanner;

public class 피보나치함수 {
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 0; i < num; i++) {
            int N = scan.nextInt();
            fibo(N);
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
    }

    static Integer[] fibo(int N) {
        if (dp[N][0] == null || dp[N][1] == null) {
            dp[N][0] = fibo(N - 1)[0] + fibo(N - 2)[0];
            dp[N][1] = fibo(N - 1)[1] + fibo(N - 2)[1];
        }
        return dp[N];
    }
}
