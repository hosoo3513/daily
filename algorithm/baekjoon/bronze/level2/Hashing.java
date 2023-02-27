package algorithm.baekjoon.bronze.level2;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String str = scan.next();

        int answer = 0;

        for (int i = 0; i < num; i++) {
            int order = str.charAt(i) - 'a' + 1;
            answer += order * Math.pow(31, i);
        }

        System.out.println(answer);
    }
}
