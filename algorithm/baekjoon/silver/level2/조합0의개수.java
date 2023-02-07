package algorithm.baekjoon.silver.level2;

import java.util.Scanner;

public class 조합0의개수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();

        int two = find_2(n) - find_2(n - m) - find_2(m);
        int five = find_5(n) - find_5(n - m) - find_5(m);

        System.out.println(Math.min(two, five));
    }

    public static int find_2(long num) {
        int count = 0;
        while (num >= 2) {
            count += (num / 2);
            num /= 2;
        }
        return count;
    }

    public static int find_5(long num) {
        int count = 0;
        while (num >= 5) {
            count += (num / 5);
            num /= 5;
        }
        return count;
    }
}
