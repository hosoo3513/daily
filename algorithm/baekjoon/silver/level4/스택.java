package algorithm.baekjoon.silver.level4;

import java.util.Scanner;
import java.util.Stack;

public class 스택 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            String next = scan.next();
            if (next.equals("push")) {
                stack.push(scan.nextInt());
            } else if (next.equals("top")) {
                if (!stack.isEmpty()) {
                    sb.append(stack.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (next.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (next.equals("empty")) {
                if (stack.size() == 0) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (next.equals("pop")) {
                if (!stack.isEmpty()) {
                    sb.append(stack.pop()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
