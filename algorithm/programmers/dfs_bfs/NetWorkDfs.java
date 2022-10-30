package algorithm.programmers.dfs_bfs;

public class NetWorkDfs {
    boolean[] visit;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                dfs(computers, i);
                answer++;
            }
        }
        return answer++;
    }

    void dfs(int[][] computers, int start) {
        visit[start] = true;
        for (int i = 0; i < computers.length; i++) {
            if (computers[start][i] == 1 && !visit[i]) {
                dfs(computers, i);
            }
        }
    }

}
