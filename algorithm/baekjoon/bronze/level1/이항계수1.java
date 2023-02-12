package algorithm.baekjoon.bronze.level1;

import java.util.Scanner;

public class 이항계수1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        System.out.println(BC(N, K));
    }

    static int BC(int N, int K) {
        if (N == K || K == 0) {
            return 1;
        }
        return BC(N - 1, K - 1) + BC(N - 1, K);
    }
}
