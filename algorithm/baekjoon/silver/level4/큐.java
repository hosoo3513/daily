package algorithm.baekjoon.silver.level4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 큐 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int last = 0;

        for (int i = 0; i < num; i++) {
            String next = scan.next();
            if (next.equals("push")) {
                last = scan.nextInt();
                queue.offer(last);
            } else if (next.equals("pop")) {
                if (!queue.isEmpty()) {
                    sb.append(queue.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (next.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (next.equals("empty")) {
                if (!queue.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
            } else if (next.equals("front")) {
                sb.append(queue.peek()).append("\n");
            } else if (next.equals("back")) {
                sb.append(last).append("\n");
            }
        }
        System.out.println(sb);
    }
}
