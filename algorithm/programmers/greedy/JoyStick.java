package algorithm.programmers.greedy;

public class JoyStick {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();

        int min = len - 1;

        for (int i = 0; i < len; i++) {
            int move = count(name.charAt(i));
            answer += move;

            int nextIndex = i + 1;
            while (nextIndex < len && name.charAt(nextIndex) == 'A')
                nextIndex++;

            // 앞으로 가는 수 + 돌아가는 수 + 반대편으로 넘어가는 수 (이 때 2,3번째는 끝의 것이 'A'이면 의미 없어진다)
            min = Math.min(min, i +(len - nextIndex) + Math.min(i, len - nextIndex));
        }

        answer += min;

        return answer;
    }

    public int count(char ch) {
        int a = ch - 'A';
        int b = 'Z' - ch + 1;
        if (a<b) return a;
        else return b;
    }

    public static void main(String[] args) {
        JoyStick J = new JoyStick();
        System.out.println(J.solution("JEROEN"));
        System.out.println(J.solution("JAN"));
    }
}
