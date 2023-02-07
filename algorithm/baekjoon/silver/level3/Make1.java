package algorithm.baekjoon.silver.level3;

import java.util.Scanner;

public class Make1 {
    static int[] dy;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        dy = new int[num + 1];

        for (int i = num; i > 1; i--) {
            if (i % 3 == 0 && (dy[i / 3] > dy[i] || dy[i/3] == 0)) {
                dy[i / 3] = dy[i] + 1;
            }
            if (i % 2 == 0 && (dy[i / 2] > dy[i] || dy[i/2] == 0)) {
                dy[i / 2] = dy[i] + 1;
            }
            if (dy[i - 1] > dy[i] || dy[i-1] == 0) {
                dy[i - 1] = dy[i] + 1;
            }
        }

        System.out.println(dy[1]);
    }
}
