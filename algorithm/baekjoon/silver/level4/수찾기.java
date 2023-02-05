package algorithm.baekjoon.silver.level4;

import java.util.Arrays;
import java.util.Scanner;

public class 수찾기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int[] arr = new int[num1];

        for (int i = 0; i < num1; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        int num2 = scan.nextInt();

        for (int i = 0; i < num2; i++) {
            int search = search(arr, scan.nextInt());
            if (search >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static int search(int[] arr, int key) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (key < arr[mid]) {
                h = mid - 1;
            } else if (key > arr[mid]) {
                l = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
