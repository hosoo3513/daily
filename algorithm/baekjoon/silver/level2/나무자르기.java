package algorithm.baekjoon.silver.level2;

import java.util.Scanner;

public class 나무자르기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] height = new int[N];

        int min = 0;
        int max = 0;


        for (int i = 0; i < N; i++) {
            height[i] = scan.nextInt();
            if(height[i] > max) max = height[i];
        }

        while (min < max) {
            int mid = (min + max) / 2;

            long sum = 0;

            for (int a : height) {
                if (a - mid > 0) {
                    sum += (a - mid);
                }
            }

            if (sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);

    }
}
