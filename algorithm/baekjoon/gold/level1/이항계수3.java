package algorithm.baekjoon.gold.level1;

import java.util.Scanner;

public class 이항계수3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        int tmp = 1;
        for (int i = 0; i < K; i++) {
            tmp *= N--;
        }
        for (int i = 1; i <= K; i++) {
            tmp /= i;
        }

        System.out.println(tmp % 1000000007);
    }
}
