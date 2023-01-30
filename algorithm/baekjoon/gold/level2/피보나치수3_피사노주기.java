package algorithm.baekjoon.gold.level2;

import java.util.Scanner;

public class 피보나치수3_피사노주기 {
    // k=10^n으로 나눈다면 피사노 주기는 15*10^(n-1)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();

        int pisano = 1500000;

        long[] arr = new long[pisano];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < pisano && i <= num; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000;
        }

        System.out.println(arr[(int) (num % pisano)]);

    }
}
