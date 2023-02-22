package algorithm.baekjoon.silver.level4;

import java.util.Scanner;

public class 설탕배달 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int dp[] = new int[num + 1];

        if (num >= 3) {
            dp[3] = 1;
        }
        if (num >= 5) {
            dp[5] = 1;
        }

        for (int i = 6; i <= num; i++) {
            if (i % 5 == 0) {
                dp[i] = dp[i - 5] + 1;
            } else if (i % 3 == 0) {
                dp[i] = dp[i - 3] + 1;
            } else {
                if (dp[i - 3] != 0 && dp[i - 5] != 0) {
                    dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
                }
            }
        }

        if (dp[num] == 0) {
            System.out.println("-1");
        } else {
            System.out.println(dp[num]);
        }
    }
}
