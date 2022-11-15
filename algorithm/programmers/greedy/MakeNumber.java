package algorithm.programmers.greedy;

import java.util.Stack;

public class MakeNumber {
    // stack 사용
    public String solution(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < ch && k-- > 0) {
                stack.pop();
            }
            stack.push(ch);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
    }

    // for문 사용 -> 테스트10 시간초과
    public String solution2(String number, int k) {
        StringBuilder str = new StringBuilder();
        str.append(number);
        for (int i = 0; i < k; i++) {
            String a = str.toString();

            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) < str.charAt(j + 1)) {
                    str.deleteCharAt(j);
                    break;
                }
            }

            if (a.equals(str.toString())) str.deleteCharAt(str.length()-1);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        MakeNumber M = new MakeNumber();
        System.out.println(M.solution("9876543210", 4));
        System.out.println(M.solution("4177252841", 4));

    }
}
