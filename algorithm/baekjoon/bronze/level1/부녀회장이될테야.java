package algorithm.baekjoon.bronze.level1;

import java.util.Scanner;

public class 부녀회장이될테야 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            int k = scan.nextInt();
            int n = scan.nextInt();
            sb.append(find(k, n)).append("\n");
        }

        System.out.println(sb);
    }

    static int find(int k, int n) {
        if (k == 0) {
            return n;
        }

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer += find(k - 1, i);
        }

        return answer;
    }
}
