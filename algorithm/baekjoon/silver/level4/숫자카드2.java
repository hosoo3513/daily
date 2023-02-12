package algorithm.baekjoon.silver.level4;

import java.util.HashMap;
import java.util.Scanner;

public class 숫자카드2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] s1 = new int[N];
        for (int i = 0; i < N; i++) {
            s1[i] = scan.nextInt();
        }

        int M = scan.nextInt();
        int[] s2 = new int[M];
        for (int i = 0; i < M; i++) {
            s2[i] = scan.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            hm.put(s1[i], hm.getOrDefault(s1[i], 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            sb.append(hm.getOrDefault(s2[i], 0)).append(" ");
        }

        System.out.println(sb);
    }
}
