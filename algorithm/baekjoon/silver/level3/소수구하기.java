package algorithm.baekjoon.silver.level3;

import java.util.Scanner;

public class 소수구하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) System.out.println(i);
        }
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
