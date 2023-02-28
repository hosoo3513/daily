package algorithm.baekjoon.bronze.level2;

import java.util.Scanner;

public class Hashing {
    static final int M = 1234567891;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String str = scan.next();

        int answer = 0;
        int pow = 1;

        for (int i = 0; i < num; i++) {
            int order = str.charAt(i) - 'a' + 1;
            answer += order * pow % M;
            pow = pow * 31 % M;
        }

        long hash = answer % M;

        System.out.println(answer);
    }
}
