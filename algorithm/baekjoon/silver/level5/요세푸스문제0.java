package algorithm.baekjoon.silver.level5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스문제0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!queue.isEmpty()) {
            for (int i = 0; i < K-1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }

        sb.delete(sb.length()-2, sb.length()).append(">");

        System.out.println(sb);
    }
}
