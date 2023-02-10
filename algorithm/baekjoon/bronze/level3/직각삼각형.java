package algorithm.baekjoon.bronze.level3;

import java.util.Scanner;

public class 직각삼각형 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            String answer = "";

            if (a >= b && a >= c) {
                if (a * a == b * b + c * c) {
                    answer += "right";
                } else {
                    answer += "wrong";
                }
            } else if (b >= a && b >= c) {
                if (b * b == a * a + c * c) {
                    answer += "right";
                } else {
                    answer += "wrong";
                }
            } else {
                if (c * c == a * a + b * b) {
                    answer += "right";
                } else {
                    answer += "wrong";
                }
            }

            System.out.println(answer);
        }
    }
}
