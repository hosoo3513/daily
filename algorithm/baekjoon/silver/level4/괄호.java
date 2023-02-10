package algorithm.baekjoon.silver.level4;

import java.util.Scanner;
import java.util.Stack;

public class 괄호 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            String str = scan.next();
            Stack<Character> stack = new Stack<>();

            for (char x : str.toCharArray()) {
                if (stack.size() == 0) {
                    stack.push(x);
                } else {
                    Character peek = stack.peek();
                    if (peek == '(' && x == ')') {
                        stack.pop();
                    } else {
                        stack.push(x);
                    }
                }
            }
            if (stack.isEmpty()) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);

    }
}
