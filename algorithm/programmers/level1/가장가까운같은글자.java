package algorithm.programmers.level1;

public class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (alphabet[s.charAt(i) - 'a'] == 0) {
                answer[i] = -1;
                alphabet[s.charAt(i) - 'a'] = i + 1;
            } else {
                answer[i] = i + 1 - alphabet[s.charAt(i) - 'a'];
                alphabet[s.charAt(i) - 'a'] = i + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        가장가까운같은글자 g = new 가장가까운같은글자();
        for (int i : g.solution("banana")) {
            System.out.print(i + " ");
        }
    }
}
