package algorithm.baekjoon.bronze.level1;

import java.util.Scanner;

public class 팰린드롬수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String str = scan.next();
            if (str.equals("0")) break;

            String answer = "yes";

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    answer = "no";
                }
            }
            System.out.println(answer);
        }
    }
}
