package algorithm.programmers.level1;

import java.util.HashMap;

public class 문자열나누기 {
    public int solution(String s) {
        int answer = 0;

        char[] chars = s.toCharArray();
        int a = 0;

        while (a<s.length()) {
            HashMap<Character, Integer> map = new HashMap<>();
            map.put(chars[a], map.getOrDefault(chars[a], 0) + 1);

            int tmp = 0;
            int cnt = answer;

            for (int i = a + 1; i < chars.length; i++) {
                if (chars[i] == chars[a]) {
                    map.put(chars[a], map.get(chars[a]) + 1);
                } else {
                    tmp++;
                }

                if (map.get(chars[a]) == tmp) {
                    answer++;
                    a = i + 1;
                    break;
                }
            }
            if (answer == cnt) {
                answer++;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        문자열나누기 m = new 문자열나누기();
        System.out.println(m.solution("aaabbaccccabba"));
    }
}
