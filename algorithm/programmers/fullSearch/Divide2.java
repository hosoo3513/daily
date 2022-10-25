package algorithm.programmers.fullSearch;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.MAX_VALUE;

public class Divide2 {
    static int[][] graph;

    public int solution(int n, int[][] wires) {
        int answer = MAX_VALUE;
        graph = new int[n + 1][n + 1];

        for (int[] arr : wires) {
            graph[arr[0]][arr[1]] = 1;
            graph[arr[1]][arr[0]] = 1;
        }

        int a,b;
        for (int i = 0; i < wires.length; i++) {
            a = wires[i][0];
            b = wires[i][1];

            graph[a][b] = 0;
            graph[b][a] = 0;
            answer = Math.min(answer, bfs(1,n));
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        return answer;
    }

    public int bfs(int x, int n) {
        int[] visit = new int[n + 1];
        int tmp = 1;

        Queue<Integer> Q = new LinkedList<>();
        Q.offer(x);

        while (!Q.isEmpty()) {
            int point = Q.poll();
            visit[point] = 1;

            for (int i = 1; i <= n; i++) {
                if (visit[i] == 1) continue;
                if (graph[point][i] == 1) {
                    Q.offer(i);
                    tmp++;
                }
            }
        }
        return Math.abs(n - 2 * tmp);
    }

    public static void main(String[] args) {
        Divide2 D = new Divide2();
        int[][] arr = new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
        System.out.println(D.solution(9, arr));
    }
}
