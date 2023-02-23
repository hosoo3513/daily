package algorithm.baekjoon.silver.level4;

import java.util.Scanner;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num; i++) {
            int tmp = scan.nextInt();
            if (tmp == 0) {
                stack.pop();
            } else {
                stack.push(tmp);
            }
        }

        int answer = 0;
        while (!stack.empty()) {
            answer += stack.pop();
        }

        System.out.println(answer);
    }
}
