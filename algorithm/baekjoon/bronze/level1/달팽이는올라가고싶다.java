package algorithm.baekjoon.bronze.level1;

import java.util.Scanner;

public class 달팽이는올라가고싶다 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();

        int tmp = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0) {
            System.out.println(tmp + 1);
        } else {
            System.out.println(tmp);
        }
    }
}
