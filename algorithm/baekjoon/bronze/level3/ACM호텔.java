package algorithm.baekjoon.bronze.level3;

import java.util.Scanner;

public class ACM호텔 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            int h = scan.nextInt();
            int w = scan.nextInt();
            int n = scan.nextInt();

            if (n % h == 0) {
                sb.append(h * 100 + (n / h)).append("\n");
            } else {
                sb.append((n % h) * 100 + (n / h + 1)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
