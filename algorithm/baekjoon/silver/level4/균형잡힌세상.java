package algorithm.baekjoon.silver.level4;

import java.util.Scanner;
import java.util.Stack;

public class 균형잡힌세상 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String s = scan.nextLine();
            String answer = "";
            if (s.equals(".")) {
                break;
            }

            System.out.println(answer(s));
        }
    }

    public static String answer(String str) {
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(' || x == '[') {
                stack.push(x);
            } else if (x == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (x == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }

}
