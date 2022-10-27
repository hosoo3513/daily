package algorithm.programmers.fullSearch;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    public int solution(String word) {
        int answer = 0;

        int[] a = new int[]{781, 156, 31, 6, 1};
        int len = word.length();

        for (int i = 0; i < len; i++) {
            answer += a[i] * "AEIOU".indexOf(word.charAt(i));
        }

        return answer + len;
    }

    List<String> list = new ArrayList<>();

    /**
     * dfs를 이용한 풀이
     */
    void dfs(String str, int len) {
        if(len > 5) return;
        list.add(str);
        for (int i = 0; i < 5; i++) dfs(str + "AEIOU".charAt(i), i + 1);

    }

    public int solution2(String word) {
        dfs("", 0);
        return list.indexOf(word);
    }



    public static void main(String[] args) {
        Dictionary D = new Dictionary();
        System.out.println(D.solution("AAAAE"));

    }
}
