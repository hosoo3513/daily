package algorithm.baekjoon.bronze.level3;

import java.util.Scanner;

public class 직사각형에서탈출 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        System.out.println(Math.min(Math.min(x, w - x), Math.min(y, h - y)));
    }
}
