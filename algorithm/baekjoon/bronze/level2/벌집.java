package algorithm.baekjoon.bronze.level2;

import java.util.Scanner;

public class 벌집 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int count = 1;
        int range = 2;

        if (num == 1) {
            System.out.println(1);
        } else {
            while (range <= num) {
                range += (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
