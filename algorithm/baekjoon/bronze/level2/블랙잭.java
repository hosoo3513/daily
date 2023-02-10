package algorithm.baekjoon.bronze.level2;

import java.util.Scanner;

public class 블랙잭 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int max = scan.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(find(arr, num, max));

    }

    public static int find(int[] arr, int num, int max) {
        int result = 0;

        for (int i = 0; i < num - 2; i++) {
            for (int j = i + 1; j < num - 1; j++) {
                for (int k = j + 1; k < num; k++) {
                    int tmp = arr[i] + arr[j] + arr[k];
                    if (max == tmp) {
                        return tmp;
                    }

                    if (result < tmp && tmp < max) {
                        result = tmp;
                    }
                }
            }
        }

        return result;
    }
}
