package algorithm.baekjoon.bronze.level1;

import java.util.Scanner;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));

    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
