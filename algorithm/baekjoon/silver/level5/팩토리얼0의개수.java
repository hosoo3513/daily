package algorithm.baekjoon.silver.level5;

import java.util.Scanner;

public class 팩토리얼0의개수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int two = 0;
        int five = 0;

        for (int i = 1; i <= num; i++) {
            two += find_2(i);
            five += find_5(i);
        }

        System.out.println(Math.min(two, five));
    }

    public static int find_2(long num) {
        int count = 0;
        while (num % 2 == 0) {
            count++;
            num /= 2;
        }
        return count;
    }

    public static int find_5(long num) {
        int count = 0;
        while (num % 5 == 0) {
            count++;
            num /= 5;
        }
        return count;
    }
}
