package algorithm.programmers.stackQueue;

import java.util.Stack;

public class CorrectParenthesis {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) answer = false;
                else stack.pop();
            }
        }

        if (!stack.isEmpty()) answer = false;

        return answer;
    }

    public static void main(String[] args) {
        CorrectParenthesis C = new CorrectParenthesis();
        System.out.println(C.solution("")); // 공백일 때가 있으므로 toCharArray를 통한 0번째 배열 호출 불가능
        System.out.println(C.solution(")((()))")); // 첫 글자가 ')'라면 무조건 false
        System.out.println(C.solution("(())()")); // 성공
    }
}
