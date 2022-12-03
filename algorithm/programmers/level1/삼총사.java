package algorithm.programmers.level1;

public class 삼총사 {
    static int answer = 0;
    static int ans[] = new int[3];
    public int solution(int[] number) {

        dfs(0, 0, number);

        return answer;
    }

    public void dfs(int idx, int depth, int[] number) {
        if (depth == 3) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += ans[i];
            }
            if (sum == 0) {
                answer++;
            }
            return;
        }
        for (int i = idx; i < number.length; i++) {
            ans[depth] = number[i];
            dfs(i + 1, depth + 1, number);
        }

    }
}
