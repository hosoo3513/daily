package algorithm.baekjoon.gold.level5;

import java.util.Scanner;

public class 리모컨 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int target = scan.nextInt();
        int m = scan.nextInt();

        boolean[] broken = new boolean[10];

        for (int i = 0; i < m; i++) {
            broken[scan.nextInt()] = true;
        }

        int result = 987654321;

        for (int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();

            boolean isBreak = false;
            for (int j = 0; j < len; j++) {
                if (broken[str.charAt(j) - '0']) {
                    isBreak = true;
                    break;
                }
            }
            if (!isBreak) {
                int min = Math.abs(target - i) + len;
                result = Math.min(min, result);
            }
        }
        System.out.println(result);
    }
}
