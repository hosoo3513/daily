package algorithm.baekjoon.silver.level5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 수정렬하기2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            arr.add(scan.nextInt());
        }

        Collections.sort(arr);

        for (int i : arr) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}
