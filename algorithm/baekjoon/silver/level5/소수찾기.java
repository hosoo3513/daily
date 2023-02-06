package algorithm.baekjoon.silver.level5;

import java.util.Scanner;

public class 소수찾기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int answer = 0;

        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            if (isPrime(scan.nextInt())) answer++;
        }

        System.out.println(answer);
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
