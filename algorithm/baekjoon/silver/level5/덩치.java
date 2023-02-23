package algorithm.baekjoon.silver.level5;

import java.util.Scanner;

public class 덩치 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[][] arr = new int[num][2];

        for (int i = 0; i < num; i++) {
            int weight = scan.nextInt();
            arr[i][0] = weight;

            int height = scan.nextInt();
            arr[i][1] = height;
        }

        for (int i = 0; i < num; i++) {
            int rank = 1;

            for (int j = 0; j < num; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
