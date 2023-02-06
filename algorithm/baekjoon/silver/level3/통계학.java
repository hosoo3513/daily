package algorithm.baekjoon.silver.level3;

import java.util.Scanner;

public class 통계학 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[8001];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int median = 10000;
        int mode = 10000;

        for (int i = 0; i < num; i++) {
            int value = scan.nextInt();
            sum += value;
            arr[value + 4000]++;

            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
        }

        int count = 0; // 중앙값 빈도 누적 수
        int mode_max = 0; // 최빈값의 최댓값

        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (arr[i] > 0) {
                // 중앙값
                if (count < (num + 1) / 2) {
                    count += arr[i];
                    median = i - 4000;
                }

                // 최빈값
                if (mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                } else if ((mode_max == arr[i] && flag) == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }

        System.out.println((int) Math.round((double) sum / num));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);
    }
}
