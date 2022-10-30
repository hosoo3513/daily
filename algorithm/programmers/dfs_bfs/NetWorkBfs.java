package algorithm.programmers.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class NetWorkBfs {
    Queue<Integer> Q = new LinkedList<>();
    int answer = 0;

    public int solution(int n, int[][] computers) {

        bfs(computers);

        return answer;
    }

    public void bfs(int[][] computers) {
        boolean[] visit = new boolean[computers.length];
        for (int i = 0; i < computers.length; i++) {
            if (visit[i] == false) {
                Q.add(i);
                visit[i] = true;
                answer++;
            }
            while (!Q.isEmpty()) {
                int poll = Q.poll();
                for (int j = 0; j < computers.length; j++) {
                    if (poll != j && computers[poll][j] == 1) {
                        Q.add(j);
                        computers[poll][j] = 0; // computers[0][1]
                        computers[j][poll] = 0; // computers[1][0]
                        visit[j] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        NetWorkBfs N = new NetWorkBfs();
        int[][] computers = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(N.solution(3,computers));
    }
}
