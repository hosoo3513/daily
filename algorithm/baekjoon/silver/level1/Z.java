package algorithm.baekjoon.silver.level1;

import java.util.Scanner;

public class Z {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int size = (int) Math.pow(2, N);

        int r = scan.nextInt();
        int c = scan.nextInt();

        find(size, r, c);

        System.out.println(count);
    }

    private static void find(int size, int r, int c) {
        if (size == 1) {
            return;
        }
        if (r < size / 2 && c < size / 2) {
            find(size / 2, r, c);
        } else if (r < size / 2 && c >= size / 2) {
            count += size * size / 4;
            find(size / 2, r, c - size / 2);
        } else if (r >= size / 2 && c < size / 2) {
            count += (size * size / 4) * 2;
            find(size / 2, r - size / 2, c);
        } else {
            count += (size * size / 4) * 3;
            find(size / 2, r - size / 2, c - size / 2);
        }
    }
}
